package twin.jin.data.model

import androidx.annotation.Keep
import androidx.room.Entity

/**
 * Created by jin on 2021/09/24.
 */
@Keep
@Entity(
    tableName = "products_cache",
    primaryKeys = ["id"]
)
data class ProductsCacheEntity(
    var id: Int,
    var name: String = "",
    var image: String? = null,
    var is_new: Boolean = false,
    var sell_count: Int = 0,
    var actual_price: Int = 0,
    var price: Int = 0
)