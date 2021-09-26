package twin.jin.presentation.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.setMain
import org.hamcrest.MatcherAssert
import org.hamcrest.core.Is
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import twin.jin.domain.data.ProductUiData
import twin.jin.domain.usecase.GetFavoritesUseCase
import twin.jin.domain.usecase.SetFavoriteUseCase
import twin.jin.presentation.ui.main.MainSharedViewModel
import twin.jin.presentation.util.getOrAwaitValue

/**
 * Created by jin on 2021/09/26.
 */
@ExperimentalCoroutinesApi
internal class MainViewModelTest {

    private val getFavoritesUseCase: GetFavoritesUseCase by lazy { mock() }
    private val setFavoritesUseCase: SetFavoriteUseCase by lazy { mock() }
    private val dispatcher = TestCoroutineDispatcher()

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule() // LiveData 테스트를 위한 객체

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        Dispatchers.setMain(dispatcher)
    }

    @After
    fun teatDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `즐겨찾기 목록이 정상 로드가 되었는가?`() = runBlockingTest {
        val givenFavorite = ProductUiData(
            id = 1,
            image = "empty",
            name = "1번 아이템",
            is_new = true,
            sell_count = 100,
            actual_price = 40000,
            price = 30000,
            isFavorite = true,
            regFavoriteTime = System.currentTimeMillis() - 100
        )
        //given
        val viewModel = MainSharedViewModel(setFavoritesUseCase, getFavoritesUseCase)
        whenever(getFavoritesUseCase.invoke()).thenReturn(listOf(givenFavorite))

        //when
        viewModel.getFavorites()
        val actual = viewModel.favorites.getOrAwaitValue()

        //then
        Mockito.verify(getFavoritesUseCase, times(1)).invoke()
        MatcherAssert.assertThat(actual.size, Is.`is`(1))

    }

}