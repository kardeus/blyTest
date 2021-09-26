package twin.jin.presentation.ui.home

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import twin.jin.domain.data.ProductUiData
import twin.jin.presentation.BR
import twin.jin.presentation.R
import twin.jin.presentation.databinding.FragmentHomeBinding
import twin.jin.presentation.databinding.ListItemProductBinding
import twin.jin.presentation.ui.base.BaseFragment
import twin.jin.presentation.ui.main.MainSharedViewModel
import twin.jin.presentation.ui.util.ItemBindingPagingDataAdapter
import twin.jin.presentation.ui.util.ProductDiffUtil
import twin.jin.presentation.ui.util.addOnItemClickedListener
import javax.inject.Singleton

/**
 * Created by jin on 2021/09/23.
 */
@Singleton
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(
    layoutRes = R.layout.fragment_home
) {

    private val sharedSharedViewModel: MainSharedViewModel by activityViewModels()
    private val viewModel: HomeViewModel by viewModels()

    private var productPagingJob: Job? = null
    private val productAdapter = ItemBindingPagingDataAdapter<ProductUiData, ListItemProductBinding>(
        R.layout.list_item_product,
        ProductDiffUtil,
        BR.product
    )

    override fun initLayout() {
        binding.setVariable(BR.viewModel, viewModel)
        binding.rvProduct.run {
            adapter = productAdapter
            addOnItemClickedListener { view, position ->
                when(view.id) {
                    R.id.like -> toggleFavorite(view, position)
                }
            }
        }
        binding.swipeRefresh.setOnRefreshListener {
            binding.bannerView.clear()
            productAdapter.refresh()
        }
        observeData()
    }

    private fun observeData() {
        lifecycleScope.launchWhenCreated {
            productAdapter.loadStateFlow.collectLatest { loadStates ->
                binding.swipeRefresh.isRefreshing = loadStates.mediator?.refresh is LoadState.Loading
            }
        }
        productPagingJob?.cancel()
        productPagingJob = lifecycleScope.launch {
            viewModel.getProductPaingFlow().collectLatest {
                productAdapter.submitData(it)
            }
        }
    }

    /** 즐겨찾기 갱신 */
    private fun toggleFavorite(view: View, position: Int) {
        val curItem = productAdapter.getItemAtPosition(position)
        curItem ?: return
        val newState = !curItem.isFavorite
        (view as AppCompatImageView).isSelected = newState
        curItem.isFavorite = newState
        sharedSharedViewModel.setFavorite(curItem.copy())
    }

}