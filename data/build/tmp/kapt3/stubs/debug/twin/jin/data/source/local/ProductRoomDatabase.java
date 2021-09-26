package twin.jin.data.source.local;

import java.lang.System;

/**
 * Created by jin on 2021/09/24.
 */
@androidx.room.Database(entities = {twin.jin.data.model.ProductsCacheEntity.class, twin.jin.data.model.FavoriteEntity.class}, views = {twin.jin.data.model.ProductsEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Ltwin/jin/data/source/local/ProductRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "productQuery", "Ltwin/jin/data/source/local/ProductQuery;", "data_debug"})
public abstract class ProductRoomDatabase extends androidx.room.RoomDatabase {
    
    public ProductRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract twin.jin.data.source.local.ProductQuery productQuery();
}