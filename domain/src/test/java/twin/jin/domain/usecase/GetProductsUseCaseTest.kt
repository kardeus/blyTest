package twin.jin.domain.usecase

import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.runBlocking
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.hamcrest.core.Is.`is`
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import twin.jin.domain.entity.TestProductData.PRODUCTS_30
import twin.jin.domain.repository.ProductRepository

/**
 * Created by jin on 2021/09/26.
 */
@ExtendWith(MockitoExtension::class)
internal class GetProductsUseCaseTest {

    @Mock
    private lateinit var productRepository: ProductRepository

    @Test
    @DisplayName("when GetProductsUseCaseTest 호출 then 10개의 응답을 확인")
    operator fun invoke() = runBlocking {
        //given
        val answer = PRODUCTS_30.take(10)
        whenever(productRepository.getProducts(0)).thenReturn(answer)
        val getProductUseCase = GetProductsUseCase(productRepository)

        // when
        val actual = getProductUseCase(0) ?: emptyList()

        //then
        Mockito.verify(productRepository, times(1)).getProducts(0)
        assertAll(
            { MatcherAssert.assertThat(actual.size, `is`(10)) },
            { MatcherAssert.assertThat(actual[0], `is`(answer[0].copy())) },
            { MatcherAssert.assertThat(actual[1], `is`(answer[1].copy())) },
            { MatcherAssert.assertThat(actual[9], `is`(answer[9].copy())) },
        )
    }

}