package twin.jin.domain.usecase

import twin.jin.domain.data.ProductUiData
import twin.jin.domain.repository.ProductRepository
import javax.inject.Inject

/**
 * Created by jin on 2021/09/26.
 */
class GetProductsUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(lastId: Int): List<ProductUiData>? = productRepository.getProducts(lastId)
}