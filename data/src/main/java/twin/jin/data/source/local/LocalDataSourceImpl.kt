package twin.jin.data.source.local

import twin.jin.data.model.FavoriteEntity
import twin.jin.data.model.ProductsCacheEntity

/**
 * Created by jin on 2021/09/24.
 */
class LocalDataSourceImpl(
    private val query: ProductQuery
): LocalDataSource {

    override suspend fun clearProductCache() = query.clearProductCache()

    override suspend fun setProductsCache(vararg products: ProductsCacheEntity) = query.insertProductsCache(*products)

    override suspend fun getProducts(lastId: Int) = query.selectAllProducts()

    override suspend fun setFavorites(favoriteEntity: FavoriteEntity) =
        if(favoriteEntity.isFavorite) {
            val insertItem = favoriteEntity.apply { regFavoriteTime = System.currentTimeMillis() }
            val id = query.insertFavorite(insertItem).toInt()
            id == favoriteEntity.id
        } else {
            val result = query.deleteFavorite(favoriteEntity)
            result > 0
        }

    override suspend fun getFavorites() = query.selectAllFavorites()
}