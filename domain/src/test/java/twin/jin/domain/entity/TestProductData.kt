package twin.jin.domain.entity

import twin.jin.domain.data.ProductUiData

/**
 * Created by jin on 2021/09/26.
 */
object TestProductData {
    val flagArray = listOf(true, false)
    val PRODUCTS_30: List<ProductUiData> = listOf(
        *(1..30).map {
            ProductUiData(
                it,
                "name $it",
                "image thumb $it",
                flagArray.random(),
                100 + it,
                10000 + (it * 1000),
                10000,
                flagArray.random(),
                System.currentTimeMillis() - it,
            )
        }.toTypedArray()
    )
}