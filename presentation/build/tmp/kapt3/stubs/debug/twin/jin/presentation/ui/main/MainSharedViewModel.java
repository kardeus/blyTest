package twin.jin.presentation.ui.main;

import java.lang.System;

/**
 * 즐겨찾기 데이터 공유 viewModel
 * Created by jin on 2021/09/23.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ltwin/jin/presentation/ui/main/MainSharedViewModel;", "Landroidx/lifecycle/ViewModel;", "setFavoriteUseCase", "Ltwin/jin/domain/usecase/SetFavoriteUseCase;", "getFavoritesUseCase", "Ltwin/jin/domain/usecase/GetFavoritesUseCase;", "(Ltwin/jin/domain/usecase/SetFavoriteUseCase;Ltwin/jin/domain/usecase/GetFavoritesUseCase;)V", "_favorites", "Landroidx/lifecycle/MutableLiveData;", "", "Ltwin/jin/domain/data/ProductUiData;", "favorites", "Landroidx/lifecycle/LiveData;", "getFavorites", "()Landroidx/lifecycle/LiveData;", "", "setFavorite", "product", "presentation_debug"})
public final class MainSharedViewModel extends androidx.lifecycle.ViewModel {
    private final twin.jin.domain.usecase.SetFavoriteUseCase setFavoriteUseCase = null;
    private final twin.jin.domain.usecase.GetFavoritesUseCase getFavoritesUseCase = null;
    
    /**
     * 즐겨찾기 product livedata
     */
    private final androidx.lifecycle.MutableLiveData<java.util.List<twin.jin.domain.data.ProductUiData>> _favorites = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.ProductUiData>> favorites = null;
    
    @javax.inject.Inject()
    public MainSharedViewModel(@org.jetbrains.annotations.NotNull()
    twin.jin.domain.usecase.SetFavoriteUseCase setFavoriteUseCase, @org.jetbrains.annotations.NotNull()
    twin.jin.domain.usecase.GetFavoritesUseCase getFavoritesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.ProductUiData>> getFavorites() {
        return null;
    }
    
    /**
     * 즐겨찾기 추가/삭제
     */
    public final void setFavorite(@org.jetbrains.annotations.NotNull()
    twin.jin.domain.data.ProductUiData product) {
    }
    
    /**
     * 즐겨찾기 목록 조회
     */
    public final void getFavorites() {
    }
}