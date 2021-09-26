package twin.jin.presentation.ui.banner

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import twin.jin.domain.data.BannerUiData
import twin.jin.presentation.BR
import twin.jin.presentation.R
import twin.jin.presentation.databinding.CellBannerBinding
import twin.jin.presentation.ui.base.BaseRecyclerAdapter

/**
 * Created by jin on 2021/09/25.
 */
class BannerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var totalCount = 0

    private var binding: CellBannerBinding =
        DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.cell_banner, this, true)

    private val adapter = object: BaseRecyclerAdapter<BannerUiData>(variableId = BR.banner) {
        override fun getItemLayoutRes(position: Int) = R.layout.list_banner
    }

    private val onPageChange: ViewPager2.OnPageChangeCallback =
        object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                updateIndicator(position)
            }
        }

    init {
        binding.vpBanner.adapter = adapter
    }

    fun updateData(banners: List<BannerUiData>?) {
        totalCount = banners?.size ?: 0
        adapter.setData(banners)
        binding.indicator.visibility = if(totalCount > 0) {
            View.VISIBLE
        } else {
            View.GONE
        }
        updateIndicator(0)
    }

    fun updateIndicator(position: Int) {
        binding.indicator.text = context.getString(
            R.string.indicator_count_format,
            position + 1,
            totalCount
        )
    }

    fun clear() {
        adapter.clearData()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        binding.vpBanner.registerOnPageChangeCallback(onPageChange)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        binding.vpBanner.unregisterOnPageChangeCallback(onPageChange)
    }
}