package twin.jin.data.model

import androidx.room.DatabaseView

/**
 * 현재 product cache와 저장된 즐겨찾기 join한 데이터를 가져오기 위한 entity
 * Created by jin on 2021/09/24.
 */
@DatabaseView(
    viewName = "products",
    value = "SELECT products_cache.id, products_cache.name, products_cache.image, products_cache.is_new, products_cache.sell_count, products_cache.actual_price, products_cache.price, favorites.isFavorite, favorites.regFavoriteTime " +
            "FROM products_cache LEFT JOIN favorites " +
            "ON products_cache.id = favorites.id"
)
data class ProductsEntity(
    var id: Int,
    var name: String = "",
    var image: String? = null,
    var is_new: Boolean = false,
    var sell_count: Int = 0,
    var actual_price: Int = 0,
    var price: Int = 0,
    var isFavorite: Boolean = false,
    var regFavoriteTime: Long = 0L

)