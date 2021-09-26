package twin.jin.domain.usecase

import twin.jin.domain.repository.ProductRepository
import javax.inject.Inject

/**
 * 즐겨찾기 조회 UseCase
 * Created by jin on 2021/09/24.
 */
class GetFavoritesUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend operator fun invoke() = productRepository.getFavorites()
}