package twin.jin.domain.usecase;

import java.lang.System;

/**
 * 즐겨찾기 조회 UseCase
 * Created by jin on 2021/09/24.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Ltwin/jin/domain/usecase/GetFavoritesUseCase;", "", "productRepository", "Ltwin/jin/domain/repository/ProductRepository;", "(Ltwin/jin/domain/repository/ProductRepository;)V", "invoke", "", "Ltwin/jin/domain/data/ProductUiData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetFavoritesUseCase {
    private final twin.jin.domain.repository.ProductRepository productRepository = null;
    
    @javax.inject.Inject()
    public GetFavoritesUseCase(@org.jetbrains.annotations.NotNull()
    twin.jin.domain.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.domain.data.ProductUiData>> continuation) {
        return null;
    }
}