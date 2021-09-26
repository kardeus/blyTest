package twin.jin.presentation.ui.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import twin.jin.presentation.BR
import java.lang.IndexOutOfBoundsException

/**
 * Created by jin on 2021/09/25.
 */
abstract class BaseRecyclerAdapter<ITEM> constructor(
    private val variableId: Int? = BR._all,
    var onItemClickListener: OnItemClickListener<ITEM>? = null
): RecyclerView.Adapter<BaseViewHolder<ITEM>>() {

    val itemList: MutableList<ITEM> = mutableListOf()

    fun getItem(position: Int) = itemList[position]

    override fun getItemCount() = itemList.size

    fun addData(_itemList: List<ITEM>) {
        this.itemList.addAll(_itemList)
        notifyDataSetChanged()
    }

    fun clearData() {
        this.itemList.clear()
        notifyDataSetChanged()
    }

    fun removeAt(position: Int) {
        if (this.itemList.isNotEmpty() && position < itemCount) {
            this.itemList.removeAt(position)
            notifyDataSetChanged()
        }
    }

    fun setData(_itemList: List<ITEM>?) {
        this.itemList.clear()
        _itemList?.let {
            addData(it)
        }
    }

    private val viewholders = mutableListOf<BaseViewHolder<ITEM>>()

    abstract fun getItemLayoutRes(position: Int): Int

    override fun getItemViewType(position: Int): Int {
        return getItemLayoutRes(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ITEM> {
        val viewHolder = BaseViewHolder<ITEM>(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                viewType,
                parent,
                false
            ), variableId
        ).apply {
            onItemClickListener?.let { listener ->
                dataBinding.root.setOnClickListener {
                    try{
                        listener.onItemClick(bindingAdapterPosition, getItem(bindingAdapterPosition))
                    }catch (e: IndexOutOfBoundsException) {
                        e.printStackTrace()
                    }
                }
            }
        }

        viewholders.add(viewHolder)
        return viewHolder
    }

    open var setVariableMap : MutableMap<Int, Any>.() -> Unit = {}

    override fun onBindViewHolder(holder: BaseViewHolder<ITEM>, position: Int) {
        try{
            holder.variableMap.apply(setVariableMap)
            if(position < itemList.size) {
                holder.onBind(getItem(position))
            } else {
                holder.onBind(null)
            }
        }catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        viewholders.forEach {
            it.onDestoryed()
        }
    }

    override fun onViewDetachedFromWindow(holder: BaseViewHolder<ITEM>) {
        super.onViewDetachedFromWindow(holder)
        holder.onDisappear()
    }

    override fun onViewRecycled(holder: BaseViewHolder<ITEM>) {
        super.onViewRecycled(holder)
        holder.onRecycled()
    }



    open fun interface OnItemClickListener<ITEM> {
        fun onItemClick(position: Int, item: ITEM)
    }

}