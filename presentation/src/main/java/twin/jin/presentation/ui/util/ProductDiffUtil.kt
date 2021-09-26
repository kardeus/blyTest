package twin.jin.presentation.ui.util

import androidx.recyclerview.widget.DiffUtil
import twin.jin.domain.data.ProductUiData

/**
 * Created by jin on 2021/09/24.
 */
object ProductDiffUtil : DiffUtil.ItemCallback<ProductUiData>() {
    override fun areItemsTheSame(oldItem: ProductUiData, newItem: ProductUiData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ProductUiData, newItem: ProductUiData): Boolean {
        return oldItem == newItem
    }

}