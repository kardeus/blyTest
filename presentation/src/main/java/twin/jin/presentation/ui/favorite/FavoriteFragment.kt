package twin.jin.presentation.ui.favorite

import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import twin.jin.domain.data.ProductUiData
import twin.jin.presentation.BR
import twin.jin.presentation.R
import twin.jin.presentation.databinding.FragmentFavoriteBinding
import twin.jin.presentation.ui.base.BaseFragment
import twin.jin.presentation.ui.base.BaseRecyclerAdapter
import twin.jin.presentation.ui.main.MainSharedViewModel
import twin.jin.presentation.ui.util.setItems
import javax.inject.Singleton

/**
 * Created by jin on 2021/09/23.
 */
@Singleton
@AndroidEntryPoint
class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>(
    layoutRes = R.layout.fragment_favorite
) {

    private val sharedViewModel: MainSharedViewModel by activityViewModels()

    override fun initLayout() {
        binding.setVariable(BR.viewModel, sharedViewModel)
        binding.rvProduct.apply {
            adapter = object : BaseRecyclerAdapter<ProductUiData>(variableId = BR.product) {
                override fun getItemLayoutRes(position: Int) = R.layout.list_item_product_favorite
            }
        }
        sharedViewModel.favorites.observe(viewLifecycleOwner) {
            binding.rvProduct.setItems(it)
        }
        sharedViewModel.getFavorites()
    }

}