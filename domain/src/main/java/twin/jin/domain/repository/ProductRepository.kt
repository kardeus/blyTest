package twin.jin.domain.repository

import twin.jin.domain.data.HomeUiData
import twin.jin.domain.data.ProductUiData

/**
 * Created by jin on 2021/09/23.
 */
interface ProductRepository {
    suspend fun getHome(): HomeUiData
    suspend fun getProducts(lastId: Int): List<ProductUiData>?
    suspend fun getFavorites(): List<ProductUiData>

    suspend fun setFavorite(product: ProductUiData): Boolean
}