package twin.jin.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import twin.jin.domain.data.ProductUiData
import twin.jin.domain.usecase.ProductPagingSourceUseCase
import javax.inject.Inject

/**
 * Created by jin on 2021/09/23.
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val productPagingSource: ProductPagingSourceUseCase
) : ViewModel() {

    companion object{
        const val PAGING_SIZE = 10
    }

    fun getProductPaingFlow(): Flow<PagingData<ProductUiData>> {
        return Pager(PagingConfig(PAGING_SIZE)) {
            productPagingSource()
        }.flow.cachedIn(viewModelScope)
    }

    fun getBanners() = productPagingSource.banners

}