package twin.jin.data.model;

import java.lang.System;

/**
 * 현재 product cache와 저장된 즐겨찾기 join한 데이터를 가져오기 위한 entity
 * Created by jin on 2021/09/24.
 */
@androidx.room.DatabaseView(viewName = "products", value = "SELECT products_cache.id, products_cache.name, products_cache.image, products_cache.is_new, products_cache.sell_count, products_cache.actual_price, products_cache.price, favorites.isFavorite, favorites.regFavoriteTime FROM products_cache LEFT JOIN favorites ON products_cache.id = favorites.id")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\u000eH\u00c6\u0003Je\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u001a\"\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013\u00a8\u00066"}, d2 = {"Ltwin/jin/data/model/ProductsEntity;", "", "id", "", "name", "", "image", "is_new", "", "sell_count", "actual_price", "price", "isFavorite", "regFavoriteTime", "", "(ILjava/lang/String;Ljava/lang/String;ZIIIZJ)V", "getActual_price", "()I", "setActual_price", "(I)V", "getId", "setId", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "()Z", "setFavorite", "(Z)V", "set_new", "getName", "setName", "getPrice", "setPrice", "getRegFavoriteTime", "()J", "setRegFavoriteTime", "(J)V", "getSell_count", "setSell_count", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_debug"})
public final class ProductsEntity {
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String image;
    private boolean is_new;
    private int sell_count;
    private int actual_price;
    private int price;
    private boolean isFavorite;
    private long regFavoriteTime;
    
    /**
     * 현재 product cache와 저장된 즐겨찾기 join한 데이터를 가져오기 위한 entity
     * Created by jin on 2021/09/24.
     */
    @org.jetbrains.annotations.NotNull()
    public final twin.jin.data.model.ProductsEntity copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String image, boolean is_new, int sell_count, int actual_price, int price, boolean isFavorite, long regFavoriteTime) {
        return null;
    }
    
    /**
     * 현재 product cache와 저장된 즐겨찾기 join한 데이터를 가져오기 위한 entity
     * Created by jin on 2021/09/24.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * 현재 product cache와 저장된 즐겨찾기 join한 데이터를 가져오기 위한 entity
     * Created by jin on 2021/09/24.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 현재 product cache와 저장된 즐겨찾기 join한 데이터를 가져오기 위한 entity
     * Created by jin on 2021/09/24.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ProductsEntity(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String image, boolean is_new, int sell_count, int actual_price, int price, boolean isFavorite, long regFavoriteTime) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean is_new() {
        return false;
    }
    
    public final void set_new(boolean p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getSell_count() {
        return 0;
    }
    
    public final void setSell_count(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getActual_price() {
        return 0;
    }
    
    public final void setActual_price(int p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public final void setPrice(int p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getRegFavoriteTime() {
        return 0L;
    }
    
    public final void setRegFavoriteTime(long p0) {
    }
}