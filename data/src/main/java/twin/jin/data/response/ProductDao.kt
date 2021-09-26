package twin.jin.data.response

import androidx.annotation.Keep
import twin.jin.data.response.entity.Product

/**
 * Created by jin on 2021/09/24.
 */
@Keep
data class ProductDao(
    var goods: List<Product>? = null
)