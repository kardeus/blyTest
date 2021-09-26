package twin.jin.data.source.remote;

import java.lang.System;

/**
 * Created by jin on 2021/09/24.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Ltwin/jin/data/source/remote/AblyApi;", "", "getHome", "Ltwin/jin/data/response/HomeDao;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Ltwin/jin/data/response/ProductDao;", "lastId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface AblyApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/home")
    public abstract java.lang.Object getHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super twin.jin.data.response.HomeDao> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/home/goods")
    public abstract java.lang.Object getProducts(@retrofit2.http.Query(value = "lastId")
    int lastId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super twin.jin.data.response.ProductDao> continuation);
}