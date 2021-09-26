package twin.jin.data.repository

import twin.jin.data.source.local.LocalDataSource
import twin.jin.data.source.remote.AblyApi
import twin.jin.data.util.toFavoritesEntity
import twin.jin.data.util.toProductCacheEntity
import twin.jin.data.util.toProductUiData
import twin.jin.domain.data.BannerUiData
import twin.jin.domain.data.HomeUiData
import twin.jin.domain.data.ProductUiData
import twin.jin.domain.repository.ProductRepository
import javax.inject.Inject

/**
 * domain repository 재정의해서 uiData로 변환
 * Created by jin on 2021/09/24.
 */
class ProductRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val api: AblyApi
): ProductRepository {

    override suspend fun getHome(): HomeUiData {
        localDataSource.clearProductCache()
        val response = api.getHome()
        response.goods?.map { it.toProductCacheEntity() }
            ?.toTypedArray()
            ?.let { localDataSource.setProductsCache(*it) }
        val products = localDataSource.getProducts(1)
        return HomeUiData(
            response.banners?.map {
                 BannerUiData(
                     it.id ?: 0,
                     it.image ?: ""
                 )
            } ?: emptyList(),
            products.map { it.toProductUiData() }
        )
    }

    override suspend fun getProducts(lastId: Int): List<ProductUiData>? {
        val result = api.getProducts(lastId).goods
        return if(result?.isEmpty() == true) {
            null
        } else {
            localDataSource.clearProductCache()
            result?.map { it.toProductCacheEntity() }
                ?.toTypedArray()
                ?.let { localDataSource.setProductsCache(*it) }
            localDataSource.getProducts(lastId).map { it.toProductUiData() }
        }
    }

    override suspend fun getFavorites(): List<ProductUiData> = localDataSource.getFavorites().map { it.toProductUiData() }

    override suspend fun setFavorite(product: ProductUiData) = localDataSource.setFavorites(product.toFavoritesEntity())

}