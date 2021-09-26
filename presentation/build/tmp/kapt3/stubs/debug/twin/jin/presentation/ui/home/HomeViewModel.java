package twin.jin.presentation.ui.home;

import java.lang.System;

/**
 * Created by jin on 2021/09/23.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ltwin/jin/presentation/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "productPagingSource", "Ltwin/jin/domain/usecase/ProductPagingSourceUseCase;", "(Ltwin/jin/domain/usecase/ProductPagingSourceUseCase;)V", "getBanners", "Landroidx/lifecycle/LiveData;", "", "Ltwin/jin/domain/data/BannerUiData;", "getProductPaingFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Ltwin/jin/domain/data/ProductUiData;", "Companion", "presentation_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final twin.jin.domain.usecase.ProductPagingSourceUseCase productPagingSource = null;
    @org.jetbrains.annotations.NotNull()
    public static final twin.jin.presentation.ui.home.HomeViewModel.Companion Companion = null;
    public static final int PAGING_SIZE = 10;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    twin.jin.domain.usecase.ProductPagingSourceUseCase productPagingSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<twin.jin.domain.data.ProductUiData>> getProductPaingFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.BannerUiData>> getBanners() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ltwin/jin/presentation/ui/home/HomeViewModel$Companion;", "", "()V", "PAGING_SIZE", "", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}