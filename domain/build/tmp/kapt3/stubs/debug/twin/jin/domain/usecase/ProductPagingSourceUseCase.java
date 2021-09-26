package twin.jin.domain.usecase;

import java.lang.System;

/**
 * 상품조회 UseCase
 * Created by jin on 2021/09/25.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u0011H\u0086\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ltwin/jin/domain/usecase/ProductPagingSourceUseCase;", "", "productRepository", "Ltwin/jin/domain/repository/ProductRepository;", "(Ltwin/jin/domain/repository/ProductRepository;)V", "_banners", "Landroidx/lifecycle/MutableLiveData;", "", "Ltwin/jin/domain/data/BannerUiData;", "banners", "Landroidx/lifecycle/LiveData;", "getBanners", "()Landroidx/lifecycle/LiveData;", "invoke", "Landroidx/paging/PagingSource;", "", "Ltwin/jin/domain/data/ProductUiData;", "Ltwin/jin/domain/type/ProductPagingSource;", "domain_debug"})
public final class ProductPagingSourceUseCase {
    private final twin.jin.domain.repository.ProductRepository productRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<twin.jin.domain.data.BannerUiData>> _banners = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.BannerUiData>> banners = null;
    
    @javax.inject.Inject()
    public ProductPagingSourceUseCase(@org.jetbrains.annotations.NotNull()
    twin.jin.domain.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.BannerUiData>> getBanners() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.PagingSource<java.lang.Integer, twin.jin.domain.data.ProductUiData> invoke() {
        return null;
    }
}