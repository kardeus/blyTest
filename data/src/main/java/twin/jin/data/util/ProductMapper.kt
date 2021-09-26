package twin.jin.data.util

import twin.jin.data.model.FavoriteEntity
import twin.jin.data.model.ProductsCacheEntity
import twin.jin.data.model.ProductsEntity
import twin.jin.data.response.entity.Product
import twin.jin.domain.data.ProductUiData


/**
 * Created by jin on 2021/09/24.
 */
fun Product.toProductCacheEntity() = ProductsCacheEntity(
    id = this.id ?: -1,
    name = this.name ?: "empty",
    image = this.image,
    is_new = this.is_new ?: false,
    sell_count = this.sell_count ?: 0,
    actual_price = this.actual_price ?: 0,
    price = this.price ?: 0
)

fun ProductsEntity.toProductUiData() = ProductUiData(
    id = this.id,
    name = this.name,
    image = this.image ?: "",
    is_new = this.is_new,
    sell_count = this.sell_count,
    actual_price = this.actual_price,
    price = this.price,
    isFavorite = this.isFavorite,
    regFavoriteTime = this.regFavoriteTime
)

fun FavoriteEntity.toProductUiData() = ProductUiData(
    id = this.id,
    name = this.name,
    image = this.image ?: "",
    is_new = this.is_new,
    sell_count = this.sell_count,
    actual_price = this.actual_price,
    price = this.price,
    isFavorite = this.isFavorite,
    regFavoriteTime = this.regFavoriteTime
)

fun ProductUiData.toFavoritesEntity() = FavoriteEntity(
    id = this.id,
    name = this.name,
    image = this.image ?: "",
    is_new = this.is_new,
    sell_count = this.sell_count,
    actual_price = this.actual_price,
    price = this.price,
    isFavorite = this.isFavorite,
    regFavoriteTime = this.regFavoriteTime
)
