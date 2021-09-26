package twin.jin.presentation.ui.base

import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by jin on 2021/09/25.
 */
open class BaseViewHolder<T>(
    open val dataBinding: ViewDataBinding,
    private val variableId: Int? = null
): RecyclerView.ViewHolder(dataBinding.root), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    val variableMap = mutableMapOf<Int, Any>()

    init {
        dataBinding.lifecycleOwner = this
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
    }

    fun onAppear() {
        try{
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START)
        }catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun onRecycled() {
        try{
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
        }catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun onDisappear() {
        try{
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        }catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun onDestoryed() {
        try{
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        }catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun onResume() {
        try{
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        }catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }

    fun onBind(item: T?) {
        try{
            variableId?.let {
                dataBinding.setVariable(it, item)
            }
            variableMap.forEach { (variableId, value) ->
                dataBinding.setVariable(variableId, value)
            }
            dataBinding.executePendingBindings()
        }catch (e: Exception) {
            e.printStackTrace()
        }
    }
}