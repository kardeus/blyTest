package twin.jin.presentation.ui.util

import android.graphics.Outline
import android.os.Build.VERSION.SDK_INT
import android.view.View
import android.view.ViewOutlineProvider
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.load
import coil.util.CoilUtils
import okhttp3.OkHttpClient
import twin.jin.domain.data.BannerUiData
import twin.jin.presentation.ui.banner.BannerView
import twin.jin.presentation.ui.base.BaseRecyclerAdapter

/**
 * Created by jin on 2021/09/23.
 */

@BindingAdapter("imagePath")
fun ImageView.imagePath(imagePath: String?) {
    val imageLoader = ImageLoader.Builder(context)
        .okHttpClient {
            OkHttpClient.Builder()
                .cache(CoilUtils.createDefaultCache(context))
                .build()
        }
        .componentRegistry {
            if(SDK_INT >= 28) {
                add(ImageDecoderDecoder())
            } else {
                add(GifDecoder())
            }
        }
        .build()
    this.load(imagePath, imageLoader)
}

@BindingAdapter("isSelected")
fun AppCompatImageView.setSelected(isSelected: Boolean) {
    this.isSelected = isSelected
}

@BindingAdapter("setViewRoundRadius")
fun View.setViewRoundRadius(radius: Float) {
    outlineProvider = object : ViewOutlineProvider() {
        override fun getOutline(p0: View?, p1: Outline?) {
            p1?.apply {
                setRoundRect(0, 0, p0?.width ?: 0, p0?.height ?: 0 , radius)
            }
        }
    }
    clipToOutline = true
}

@BindingAdapter("android:visibility")
fun View.setVisibility(isVisible: Boolean) {
    visibility = if(isVisible) View.VISIBLE else View.GONE
}

@BindingAdapter("setItems")
fun RecyclerView.setItems(items: List<Any>?) {
    items?.let {
        (adapter as? BaseRecyclerAdapter<Any>)?.setData(it)
    }
}

@BindingAdapter("addItemDecoration")
fun RecyclerView.addItemDecoration(itemDecoration: RecyclerView.ItemDecoration?) {
    itemDecoration?.let {
        addItemDecoration(itemDecoration)
    }
}

@BindingAdapter("setBanner")
fun BannerView.setBanner(banners: List<BannerUiData>?) {
    updateData(banners)
}