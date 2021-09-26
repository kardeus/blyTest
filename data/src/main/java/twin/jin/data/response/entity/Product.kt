package twin.jin.data.response.entity

import androidx.annotation.Keep

/**
 * Created by jin on 2021/09/24.
 */
@Keep
data class Product(
    var id: Int?,
    var name: String?,
    var image: String?,
    var is_new: Boolean?,
    var sell_count: Int?,
    var actual_price: Int?,
    var price: Int?
)
