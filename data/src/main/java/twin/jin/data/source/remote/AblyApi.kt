package twin.jin.data.source.remote

import retrofit2.http.GET
import retrofit2.http.Query
import twin.jin.data.response.HomeDao
import twin.jin.data.response.ProductDao

/**
 * Created by jin on 2021/09/24.
 */
interface AblyApi {

    @GET("api/home")
    suspend fun getHome(): HomeDao

    @GET("api/home/goods")
    suspend fun getProducts(@Query("lastId") lastId: Int) : ProductDao
}