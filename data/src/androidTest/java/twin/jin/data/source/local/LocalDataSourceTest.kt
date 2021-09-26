package twin.jin.data.source.local

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.runBlocking
import org.hamcrest.MatcherAssert
import org.hamcrest.core.Is
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.DisplayName
import org.junit.runner.RunWith
import twin.jin.data.model.FavoriteEntity
import twin.jin.data.model.ProductsCacheEntity
import java.io.IOException

/**
 * Created by jin on 2021/09/26.
 */
@RunWith(AndroidJUnit4::class)
class LocalDataSourceTest {

    private lateinit var query: ProductQuery
    private lateinit var database: ProductRoomDatabase

    @Before
    fun createDB() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        database = Room.inMemoryDatabaseBuilder(context, ProductRoomDatabase::class.java).build()
        query = database.productQuery()
    }

    @After
    @Throws(IOException::class)
    fun closeDB() {
        database.close()
    }

    @Test
    fun `Database_캐시_아이템_1개_insert시_정상_동작하는가`() = runBlocking {
        // given
        query.insertProductsCache(ProductsCacheEntity(1))

        //when
        val actual = query.selectAllProductCache()

        //then
        MatcherAssert.assertThat(actual.size, Is.`is`(1))
    }

    @Test
    fun `Database_즐겨찾기_추가시_정상_동작하는가`() = runBlocking {
        // given
        val givenId = 1
        val givenFavorite = true
        query.insertFavorite(FavoriteEntity(id = givenId, isFavorite = givenFavorite))

        // when
        val actual = query.selectAllFavorites()

        // then
        MatcherAssert.assertThat(actual.size, Is.`is`(1))
        MatcherAssert.assertThat(actual[0].id, Is.`is`(givenId))
        MatcherAssert.assertThat(actual[0].isFavorite, Is.`is`(givenFavorite))
    }

    @Test
    fun `저장된_즐겨찾기가_3개일경우_중간_item제거시_순서체크`() = runBlocking {
        // given
        query.insertFavorite(FavoriteEntity(id = 1, "1번 아이템"))
        query.insertFavorite(FavoriteEntity(id = 2, "2번 아이템"))
        query.insertFavorite(FavoriteEntity(id = 3, "3번 아이템"))

        // when
        query.deleteFavorite(FavoriteEntity(id = 2, "2번 아이템"))
        val actual = query.selectAllFavorites()

        // then
        MatcherAssert.assertThat(actual.size, Is.`is`(2))
        MatcherAssert.assertThat(actual[0].id, Is.`is`(1))
        MatcherAssert.assertThat(actual[1].id, Is.`is`(3))
    }
}