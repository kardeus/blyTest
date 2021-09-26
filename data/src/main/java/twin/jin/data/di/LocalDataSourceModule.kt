package twin.jin.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import twin.jin.data.source.local.LocalDataSource
import twin.jin.data.source.local.LocalDataSourceImpl
import twin.jin.data.source.local.ProductQuery
import twin.jin.data.source.local.ProductRoomDatabase
import javax.inject.Singleton

/**
 * hilt module 정의
 * Created by jin on 2021/09/24.
 */
@Module
@InstallIn(SingletonComponent::class)
object LocalDataSourceModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(
        query: ProductQuery
    ): LocalDataSource = LocalDataSourceImpl(query)

    @Singleton
    @Provides
    fun provideRoomDatabase(
        @ApplicationContext context: Context
    ): ProductRoomDatabase = Room.databaseBuilder(context.applicationContext, ProductRoomDatabase::class.java, "product.db")
        .fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    fun provideProductQuery(
        productRoomDatabase: ProductRoomDatabase
    ): ProductQuery = productRoomDatabase.productQuery()
}