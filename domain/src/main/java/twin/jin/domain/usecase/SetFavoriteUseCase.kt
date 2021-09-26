package twin.jin.domain.usecase

import twin.jin.domain.data.ProductUiData
import twin.jin.domain.repository.ProductRepository
import javax.inject.Inject

/**
 * 즐겨찾기 갱신 UseCase
 * Created by jin on 2021/09/24.
 */
class SetFavoriteUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke(product: ProductUiData) = productRepository.setFavorite(product)
}