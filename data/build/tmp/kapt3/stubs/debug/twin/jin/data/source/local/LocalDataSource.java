package twin.jin.data.source.local;

import java.lang.System;

/**
 * Created by jin on 2021/09/24.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Ltwin/jin/data/source/local/LocalDataSource;", "", "clearProductCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "", "Ltwin/jin/data/model/FavoriteEntity;", "getProducts", "Ltwin/jin/data/model/ProductsEntity;", "lastId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorites", "", "favoriteEntity", "(Ltwin/jin/data/model/FavoriteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setProductsCache", "", "products", "", "Ltwin/jin/data/model/ProductsCacheEntity;", "([Ltwin/jin/data/model/ProductsCacheEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface LocalDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearProductCache(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setProductsCache(@org.jetbrains.annotations.NotNull()
    twin.jin.data.model.ProductsCacheEntity[] products, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super long[]> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProducts(int lastId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.data.model.ProductsEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setFavorites(@org.jetbrains.annotations.NotNull()
    twin.jin.data.model.FavoriteEntity favoriteEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.data.model.FavoriteEntity>> continuation);
}