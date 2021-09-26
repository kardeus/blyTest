package twin.jin.data.di

import android.content.Context
import android.webkit.CookieManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import twin.jin.data.repository.ProductRepositoryImpl
import twin.jin.data.source.local.LocalDataSource
import twin.jin.data.source.remote.AblyApi
import twin.jin.data.util.OkHttp3Logger
import twin.jin.domain.repository.ProductRepository
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * hilt module 정의
 * Created by jin on 2021/09/24.
 */
@Module
@InstallIn(SingletonComponent::class)
object OkHttpClientModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(
        builder: OkHttpClient.Builder
    ) : OkHttpClient {
        return builder
            .connectTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .cookieJar(NetCookie())
            .build()
    }

    @Singleton
    @Provides
    fun provideRepository(
        localDataSource: LocalDataSource,
        api: AblyApi
    ): ProductRepository = ProductRepositoryImpl(localDataSource, api)

    @Singleton
    @Provides
    fun provideOkHttpClientBuilder(
        @ApplicationContext context: Context,
    ): OkHttpClient.Builder {
        return OkHttpClient().newBuilder()
            .addNetworkInterceptor(OkHttp3Logger())
    }

    @Singleton
    @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient
    ): Retrofit = Retrofit.Builder().apply {
        baseUrl("http://d2bab9i9pr8lds.cloudfront.net/")
        addConverterFactory(GsonConverterFactory.create())
        client(okHttpClient)
    }.build()
}

class NetCookie : CookieJar {
    override fun loadForRequest(url: HttpUrl): List<Cookie> {
        return CookieManager.getInstance().getCookie(url.toString())?.let { it ->
            it.split("[,;]".toRegex())
                .dropLastWhile { it.isEmpty() }
                .map { Cookie.parse(url, it.trim())!! }
                .toList()
        } ?: emptyList()
    }

    override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
        cookies.forEach {
            CookieManager.getInstance().setCookie(url.toString(), it.toString())
        }
    }

}