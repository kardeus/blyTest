package twin.jin.presentation.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import twin.jin.presentation.BR

/**
 * Created by jin on 2021/09/23.
 */
abstract class BaseActivity<B: ViewDataBinding, M: ViewModel>(
    private val layoutRes: Int
) : AppCompatActivity() {

    protected abstract val viewModel: M

    protected lateinit var binding: B

    /** Layout 초기화 함수 */
    open fun initLayout() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        binding.lifecycleOwner = this
        binding.setVariable(BR.viewModel, viewModel)
        initLayout()
    }
}