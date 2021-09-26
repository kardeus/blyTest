package twin.jin.data.source.local;

import java.lang.System;

/**
 * Created by jin on 2021/09/24.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Ltwin/jin/data/source/local/LocalDataSourceImpl;", "Ltwin/jin/data/source/local/LocalDataSource;", "query", "Ltwin/jin/data/source/local/ProductQuery;", "(Ltwin/jin/data/source/local/ProductQuery;)V", "clearProductCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "", "Ltwin/jin/data/model/FavoriteEntity;", "getProducts", "Ltwin/jin/data/model/ProductsEntity;", "lastId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorites", "", "favoriteEntity", "(Ltwin/jin/data/model/FavoriteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setProductsCache", "", "products", "", "Ltwin/jin/data/model/ProductsCacheEntity;", "([Ltwin/jin/data/model/ProductsCacheEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class LocalDataSourceImpl implements twin.jin.data.source.local.LocalDataSource {
    private final twin.jin.data.source.local.ProductQuery query = null;
    
    public LocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    twin.jin.data.source.local.ProductQuery query) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearProductCache(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setProductsCache(@org.jetbrains.annotations.NotNull()
    twin.jin.data.model.ProductsCacheEntity[] products, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super long[]> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProducts(int lastId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.data.model.ProductsEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setFavorites(@org.jetbrains.annotations.NotNull()
    twin.jin.data.model.FavoriteEntity favoriteEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.data.model.FavoriteEntity>> continuation) {
        return null;
    }
}