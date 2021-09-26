package twin.jin.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import twin.jin.data.source.remote.AblyApi
import javax.inject.Singleton

/**
 * hilt module 정의
 * Created by jin on 2021/09/24.
 */
@Module
@InstallIn(SingletonComponent::class)
object RemoteDataSourceModule {

    @Singleton
    @Provides
    fun provideAblyApi(
        retrofit: Retrofit
    ): AblyApi {
        return retrofit.create(AblyApi::class.java)
    }
}