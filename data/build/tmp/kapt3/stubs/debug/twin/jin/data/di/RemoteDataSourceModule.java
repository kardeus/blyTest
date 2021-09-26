package twin.jin.data.di;

import java.lang.System;

/**
 * hilt module 정의
 * Created by jin on 2021/09/24.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ltwin/jin/data/di/RemoteDataSourceModule;", "", "()V", "provideAblyApi", "Ltwin/jin/data/source/remote/AblyApi;", "retrofit", "Lretrofit2/Retrofit;", "data_debug"})
@dagger.Module()
public final class RemoteDataSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final twin.jin.data.di.RemoteDataSourceModule INSTANCE = null;
    
    private RemoteDataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final twin.jin.data.source.remote.AblyApi provideAblyApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}