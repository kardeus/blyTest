package twin.jin.presentation.ui.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import twin.jin.presentation.BR

/**
 * PagingAdapter 정의
 * Created by jin on 2021/09/25.
 */
open class ItemBindingPagingDataAdapter<DATA : Any, BIND : ViewDataBinding>(
    private val layoutResId: Int,
    itemCallback: DiffUtil.ItemCallback<DATA>,
    private val brId: Int = BR._all
) : PagingDataAdapter<DATA, ItemBindingPagingDataAdapter.Holder<BIND>>(itemCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder<BIND> {
        val itemView = getItemView(layoutResId, parent, viewType)
        return Holder(itemView)
    }

    open fun getItemView(@LayoutRes layoutResId: Int, parent: ViewGroup, viewType: Int): View {
        return LayoutInflater.from(parent.context).inflate(layoutResId, parent, false)
    }

    @CallSuper
    override fun onBindViewHolder(holder: Holder<BIND>, position: Int) {
        if (brId != BR._all) {
            holder.itemBinding.setVariable(brId, getItem(position))
            holder.itemBinding.executePendingBindings()
        }
    }

    class Holder<BIND : ViewDataBinding>(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemBinding: BIND = DataBindingUtil.bind(itemView)!!
    }

    fun getItemAtPosition(position: Int): DATA? = super.getItem(position)
}