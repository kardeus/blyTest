package twin.jin.domain.data

import kotlin.math.ceil

/**
 * product Ui Data
 * Created by jin on 2021/09/24.
 */
data class ProductUiData(
    val id: Int,
    val image: String,
    val name: String,
    val is_new: Boolean,
    val sell_count: Int,
    val actual_price: Int,
    val price: Int,
    var isFavorite: Boolean,
    var regFavoriteTime: Long = 0L
) {

    val pricePercent = 100 - ceil(((price.toDouble() / actual_price.toDouble()) * 100)).toInt()
}
