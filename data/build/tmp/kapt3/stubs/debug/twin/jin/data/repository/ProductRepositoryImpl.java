package twin.jin.data.repository;

import java.lang.System;

/**
 * domain repository 재정의해서 uiData로 변환
 * Created by jin on 2021/09/24.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Ltwin/jin/data/repository/ProductRepositoryImpl;", "Ltwin/jin/domain/repository/ProductRepository;", "localDataSource", "Ltwin/jin/data/source/local/LocalDataSource;", "api", "Ltwin/jin/data/source/remote/AblyApi;", "(Ltwin/jin/data/source/local/LocalDataSource;Ltwin/jin/data/source/remote/AblyApi;)V", "getFavorites", "", "Ltwin/jin/domain/data/ProductUiData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHome", "Ltwin/jin/domain/data/HomeUiData;", "getProducts", "lastId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorite", "", "product", "(Ltwin/jin/domain/data/ProductUiData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class ProductRepositoryImpl implements twin.jin.domain.repository.ProductRepository {
    private final twin.jin.data.source.local.LocalDataSource localDataSource = null;
    private final twin.jin.data.source.remote.AblyApi api = null;
    
    @javax.inject.Inject()
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull()
    twin.jin.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    twin.jin.data.source.remote.AblyApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super twin.jin.domain.data.HomeUiData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProducts(int lastId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.domain.data.ProductUiData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.domain.data.ProductUiData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setFavorite(@org.jetbrains.annotations.NotNull()
    twin.jin.domain.data.ProductUiData product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}