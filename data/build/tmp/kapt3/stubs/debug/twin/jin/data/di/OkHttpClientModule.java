package twin.jin.data.di;

import java.lang.System;

/**
 * hilt module 정의
 * Created by jin on 2021/09/24.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007\u00a8\u0006\u0013"}, d2 = {"Ltwin/jin/data/di/OkHttpClientModule;", "", "()V", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "builder", "Lokhttp3/OkHttpClient$Builder;", "provideOkHttpClientBuilder", "context", "Landroid/content/Context;", "provideRepository", "Ltwin/jin/domain/repository/ProductRepository;", "localDataSource", "Ltwin/jin/data/source/local/LocalDataSource;", "api", "Ltwin/jin/data/source/remote/AblyApi;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "data_debug"})
@dagger.Module()
public final class OkHttpClientModule {
    @org.jetbrains.annotations.NotNull()
    public static final twin.jin.data.di.OkHttpClientModule INSTANCE = null;
    
    private OkHttpClientModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient.Builder builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final twin.jin.domain.repository.ProductRepository provideRepository(@org.jetbrains.annotations.NotNull()
    twin.jin.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    twin.jin.data.source.remote.AblyApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient.Builder provideOkHttpClientBuilder(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}