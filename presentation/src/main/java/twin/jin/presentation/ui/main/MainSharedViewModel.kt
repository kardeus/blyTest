package twin.jin.presentation.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import twin.jin.domain.data.ProductUiData
import twin.jin.domain.usecase.GetFavoritesUseCase
import twin.jin.domain.usecase.SetFavoriteUseCase
import javax.inject.Inject

/**
 * 즐겨찾기 데이터 공유 viewModel
 * Created by jin on 2021/09/23.
 */
@HiltViewModel
class MainSharedViewModel @Inject constructor(
    private val setFavoriteUseCase: SetFavoriteUseCase,
    private val getFavoritesUseCase: GetFavoritesUseCase
): ViewModel(){

    /** 즐겨찾기 product livedata */
    private val _favorites = MutableLiveData<List<ProductUiData>>()
    val favorites : LiveData<List<ProductUiData>> = _favorites

    /**
     * 즐겨찾기 추가/삭제
     * */
    fun setFavorite(product: ProductUiData) {
        viewModelScope.launch {
            setFavoriteUseCase.invoke(product)
            getFavorites()
        }
    }

    /**
     * 즐겨찾기 목록 조회
     * */
    fun getFavorites() {
        viewModelScope.launch {
            val result = getFavoritesUseCase()
            _favorites.value = result
        }
    }

}