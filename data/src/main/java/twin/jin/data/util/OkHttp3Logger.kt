package twin.jin.data.util

import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okio.Buffer
import okio.GzipSource
import org.json.JSONArray
import org.json.JSONObject
import java.nio.charset.Charset
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList
import kotlin.experimental.and

/**
 * Created by jin on 2021/09/24.
 */
class OkHttp3Logger: Interceptor {

    companion object {
        const val LOG = true

        const val REQUEST_SIMPLE = true
        const val REQUEST_BODY = false
        const val REQUEST_BODY_RAW = false
        const val REQUEST_COOKIE = false
        const val REQUEST_HEADER = false
        const val RESPONSE_SIMPLE = true
        const val RESPONSE_BODY = false
        const val RESPONSE_BODY_RAW = false
        const val RESPONSE_COOKIE = false
        const val RESPONSE_HEADER = false

        const val COOKIE = "Cookie"
        const val SET_COOKIE = "Set-Cookie"

        private val UTF8 = Charset.forName("UTF-8")

        private const val LF = "\n"
        private const val MAX_LOG_LINE_BYTE_SIZE = 3600
        private const val PREFIX = "``"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!LOG)
            return chain.proceed(chain.request())

        val request = chain.request()

        val requestSimple = "${request.method}:${request.url} ${request.bodyString().minify.toSingleLine}"
        val requestBody = request.bodyString().formatting
        val requestBodyRaw = request.bodyString()
        val requestCookie = request.headers.cookieString()
        val requestHeader = request.headers.headerString()

        if (REQUEST_SIMPLE) redLog(requestSimple)
        if (REQUEST_BODY) redLog(requestBody)
        if (REQUEST_BODY_RAW) redLog(requestBodyRaw)
        if (REQUEST_COOKIE) redLog(requestCookie)
        if (REQUEST_HEADER) redLog(requestHeader)

        val startNs = System.nanoTime()
        return kotlin.runCatching {
            chain.proceed(request)
        }.onSuccess { response ->
            val tookMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs)

            val responseSimple = "${response.code} ${response.message} (${tookMs}ms) ${response.request.url}  ${response.bodyString().minify.toSingleLine}"
            val responseBody = response.bodyString().formatting
            val responseBodyRaw = response.bodyString()
            val responseCookie = response.headers.cookieString()
            val responseHeader = response.headers.headerString()

            val priority = response.isSuccessful.infoOrWarn
            if (RESPONSE_SIMPLE) greenOrYellowLog(priority, responseSimple)
            if (RESPONSE_BODY) greenOrYellowLog(priority, responseBody)
            if (RESPONSE_BODY_RAW) greenOrYellowLog(priority, responseBodyRaw)
            if (RESPONSE_COOKIE) greenOrYellowLog(priority, responseCookie)
            if (RESPONSE_HEADER) greenOrYellowLog(priority, responseHeader)
        }.onFailure {
            yellowLog((it.message + requestSimple + requestBody).toSingleLine)
        }.getOrThrow()
    }

    private fun redLog(vararg args: Any?) {
        if (!LOG) return
        val msg: String = makeMessage(*args)
        println(android.util.Log.ERROR, msg)
    }

    private fun yellowLog(vararg args: Any?) {
        val msg: String = makeMessage(*args)
        println(android.util.Log.WARN, msg)
    }

    private fun greenOrYellowLog(priority: Int, vararg args: Any?) {
        val msg: String = makeMessage(*args)
        println(priority, msg)
    }

    private fun println(priority: Int, msg: String?) {
        val sa = ArrayList<String>(100)
        val st = StringTokenizer(msg, LF, false)
        while (st.hasMoreTokens()) {
            val byteText = st.nextToken().toByteArray()
            var offset = 0
            while (offset < byteText.size) {
                val count: Int = safeCut(byteText, offset)
                sa.add(PREFIX + String(byteText, offset, count))
                offset += count
            }
        }
        when (sa.size) {
            0 -> android.util.Log.println(priority, "okHttp", PREFIX)
            else -> sa.forEach { android.util.Log.println(priority, "okHttp", it) }
        }
    }

    private fun safeCut(byteArray: ByteArray, startOffset: Int): Int {
        val byteLength = byteArray.size
        if (byteLength <= startOffset) throw ArrayIndexOutOfBoundsException("!!text_length <= start_byte_index")
        if (byteArray[startOffset] and 0xc0.toByte() == 0x80.toByte()) throw java.lang.UnsupportedOperationException("!!start_byte_index must splited index")

        var position = startOffset + MAX_LOG_LINE_BYTE_SIZE
        if (byteLength <= position) return byteLength - startOffset

        while (startOffset <= position) {
            if (byteArray[position] and 0xc0.toByte() != 0x80.toByte()) break
            position--
        }
        if (position <= startOffset) throw UnsupportedOperationException("!!byte_length too small")
        return position - startOffset
    }

    private fun makeMessage(vararg args: Any?): String = args.joinToString { it.formatting }

    private fun Headers.headerString(): String {
        val _in_h = StringBuilder()
        for (i in 0 until size)
            if (name(i) != SET_COOKIE && name(i) != COOKIE)
                _in_h.divide.append(name(i) + ": " + value(i))
        return _in_h.toString()
    }

    private fun Headers.cookieString(): String {
        val _in_c = StringBuilder()
        for (i in 0 until size)
            if (name(i) == SET_COOKIE || name(i) == COOKIE)
                _in_c.divide.append(name(i) + ": " + value(i))
        return _in_c.toString()
    }

    private fun Request.bodyString(): String {
        if (bodyHasUnknownEncoding(headers))
            return ""
        body ?: return ""

        val body = body!!
        val buffer = Buffer()
        body.writeTo(buffer)
        val contentType = body.contentType()
        var charset: Charset? = UTF8
        if (contentType != null)
            charset = contentType.charset(UTF8)

        return if (isPlaintext(buffer))
            buffer.clone().readString(charset!!)
        else
            "BODY_BINARY:[${body.contentLength()}]"
    }

    private fun Response.bodyString(): String {
        body ?: return ""

        if (bodyHasUnknownEncoding(headers))
            return ""

        val body = body!!

        val source = body.source()
        source.request(java.lang.Long.MAX_VALUE) // Buffer the entire body.
        var buffer = source.buffer

        if ("gzip".equals(headers["Content-Encoding"], ignoreCase = true)) {
            var gzippedResponseBody: GzipSource? = null
            try {
                gzippedResponseBody = GzipSource(buffer.clone())
                buffer = Buffer()
                buffer.writeAll(gzippedResponseBody)
            } finally {
                gzippedResponseBody?.close()
            }
        }

        val charset = body.contentType()?.charset(UTF8) ?: UTF8

        return if (body.contentLength() != 0L)
            buffer.clone().readString(charset)
        else
            ""
    }

    private fun bodyHasUnknownEncoding(headers: Headers): Boolean {
        val contentEncoding = headers["Content-Encoding"]
        return (contentEncoding != null
                && !contentEncoding.equals("identity", ignoreCase = true)
                && !contentEncoding.equals("gzip", ignoreCase = true))
    }

    private fun isPlaintext(buffer: Buffer): Boolean = kotlin.runCatching {
        val prefix = Buffer()
        val byteCount = if (buffer.size < 64) buffer.size else 64
        buffer.copyTo(prefix, 0, byteCount)
        for (i in 0..15) {
            if (prefix.exhausted()) {
                break
            }
            val codePoint = prefix.readUtf8CodePoint()
            if (Character.isISOControl(codePoint) && !Character.isWhitespace(codePoint)) {
                return false
            }
        }
        return true
    }.getOrDefault(false)

    private val StringBuilder.divide: StringBuilder
        get() = if (isNotEmpty())
            append("\n")
        else
            this

    private val Any?.formatting
        get() = kotlin.runCatching {
            JSONObject((this as String).trim()).toString(2)
        }.recoverCatching {
            JSONArray((this as String).trim()).toString(2)
        }.getOrDefault(this.toString())

    private val Any?.minify
        get() = kotlin.runCatching {
            JSONObject((this as String).trim()).toString()
        }.recoverCatching {
            JSONArray((this as String).trim()).toString()
        }.getOrDefault(this.toString())

    private val String?.toSingleLine: String
        get() {
            return if (this == null)
                "null"
            else toCharArray()
                .take(1000)
                .filterNot { it == '\n' }
                .filterNot { it == '\r' }
                .joinToString("")
        }

    private val Boolean?.infoOrWarn: Int get() = if (this == true) android.util.Log.INFO else android.util.Log.WARN
}