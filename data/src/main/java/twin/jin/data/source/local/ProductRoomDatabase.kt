package twin.jin.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import twin.jin.data.model.FavoriteEntity
import twin.jin.data.model.ProductsCacheEntity
import twin.jin.data.model.ProductsEntity

/**
 * Created by jin on 2021/09/24.
 */
@Database(
    entities = [ProductsCacheEntity::class, FavoriteEntity::class],
    views = [ProductsEntity::class],
    version = 1
)
abstract class ProductRoomDatabase: RoomDatabase() {
    abstract fun productQuery(): ProductQuery
}