package twin.jin.data.source.local

import androidx.room.*
import twin.jin.data.model.FavoriteEntity
import twin.jin.data.model.ProductsCacheEntity
import twin.jin.data.model.ProductsEntity

/**
 * Created by jin on 2021/09/24.
 */
@Dao
interface ProductQuery {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProductsCache(vararg productsForCache: ProductsCacheEntity): LongArray

    @Query("DELETE FROM products_cache")
    suspend fun clearProductCache(): Int

    @Query("SELECT * FROM products ORDER BY id")
    suspend fun selectAllProducts(): List<ProductsEntity>

    @Query("SELECT * FROM favorites ORDER BY regFavoriteTime")
    suspend fun selectAllFavorites(): List<FavoriteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(favorite: FavoriteEntity): Long

    @Query("SELECT * FROM products_cache")
    suspend fun selectAllProductCache(): List<ProductsCacheEntity>

    @Delete
    suspend fun deleteFavorite(favorite: FavoriteEntity): Int
}