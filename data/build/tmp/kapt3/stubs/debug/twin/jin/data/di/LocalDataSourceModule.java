package twin.jin.data.di;

import java.lang.System;

/**
 * hilt module 정의
 * Created by jin on 2021/09/24.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Ltwin/jin/data/di/LocalDataSourceModule;", "", "()V", "provideLocalDataSource", "Ltwin/jin/data/source/local/LocalDataSource;", "query", "Ltwin/jin/data/source/local/ProductQuery;", "provideProductQuery", "productRoomDatabase", "Ltwin/jin/data/source/local/ProductRoomDatabase;", "provideRoomDatabase", "context", "Landroid/content/Context;", "data_debug"})
@dagger.Module()
public final class LocalDataSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final twin.jin.data.di.LocalDataSourceModule INSTANCE = null;
    
    private LocalDataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final twin.jin.data.source.local.LocalDataSource provideLocalDataSource(@org.jetbrains.annotations.NotNull()
    twin.jin.data.source.local.ProductQuery query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final twin.jin.data.source.local.ProductRoomDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final twin.jin.data.source.local.ProductQuery provideProductQuery(@org.jetbrains.annotations.NotNull()
    twin.jin.data.source.local.ProductRoomDatabase productRoomDatabase) {
        return null;
    }
}