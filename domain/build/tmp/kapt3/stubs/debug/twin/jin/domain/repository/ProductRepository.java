package twin.jin.domain.repository;

import java.lang.System;

/**
 * Created by jin on 2021/09/23.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Ltwin/jin/domain/repository/ProductRepository;", "", "getFavorites", "", "Ltwin/jin/domain/data/ProductUiData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHome", "Ltwin/jin/domain/data/HomeUiData;", "getProducts", "lastId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavorite", "", "product", "(Ltwin/jin/domain/data/ProductUiData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super twin.jin.domain.data.HomeUiData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProducts(int lastId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.domain.data.ProductUiData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<twin.jin.domain.data.ProductUiData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setFavorite(@org.jetbrains.annotations.NotNull()
    twin.jin.domain.data.ProductUiData product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}