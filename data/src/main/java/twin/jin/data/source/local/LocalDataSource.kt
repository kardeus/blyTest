package twin.jin.data.source.local

import twin.jin.data.model.FavoriteEntity
import twin.jin.data.model.ProductsCacheEntity
import twin.jin.data.model.ProductsEntity

/**
 * Created by jin on 2021/09/24.
 */
interface LocalDataSource {
    suspend fun clearProductCache(): Int
    suspend fun setProductsCache(vararg products: ProductsCacheEntity): LongArray
    suspend fun getProducts(lastId: Int): List<ProductsEntity>

    suspend fun setFavorites(favoriteEntity: FavoriteEntity): Boolean
    suspend fun getFavorites(): List<FavoriteEntity>
}