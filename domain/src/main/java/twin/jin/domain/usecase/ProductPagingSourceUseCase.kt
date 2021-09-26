package twin.jin.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagingState
import twin.jin.domain.data.BannerUiData
import twin.jin.domain.data.ProductUiData
import twin.jin.domain.repository.ProductRepository
import twin.jin.domain.type.ProductPagingSource
import javax.inject.Inject

/**
 * 상품조회 UseCase
 * Created by jin on 2021/09/25.
 */
class ProductPagingSourceUseCase @Inject constructor(
    private val productRepository: ProductRepository
){
    private val _banners = MutableLiveData<List<BannerUiData>>()
    val banners : LiveData<List<BannerUiData>> = _banners

    operator fun invoke(): ProductPagingSource {
        return object : ProductPagingSource() {
            override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ProductUiData> =
                kotlin.runCatching {
                    val lastId = params.key ?: 0
                    val response = if(lastId == 0) {
                        val result = productRepository.getHome()
                        _banners.value = result.banners
                        result.goods
                    } else {
                        productRepository.getProducts(lastId)
                    }
                    val nextKey = response?.last()?.id
                    if(nextKey == null) LoadResult.Error(Throwable("Last")) else LoadResult.Page(response, null, nextKey)
                }.getOrElse { LoadResult.Error(it) }

            override fun getRefreshKey(state: PagingState<Int, ProductUiData>): Int? {
                return 0
            }
        }
    }
}