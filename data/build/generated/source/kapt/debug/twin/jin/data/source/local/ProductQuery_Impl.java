package twin.jin.data.source.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import twin.jin.data.model.FavoriteEntity;
import twin.jin.data.model.ProductsCacheEntity;
import twin.jin.data.model.ProductsEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductQuery_Impl implements ProductQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductsCacheEntity> __insertionAdapterOfProductsCacheEntity;

  private final EntityInsertionAdapter<FavoriteEntity> __insertionAdapterOfFavoriteEntity;

  private final EntityDeletionOrUpdateAdapter<FavoriteEntity> __deletionAdapterOfFavoriteEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearProductCache;

  public ProductQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductsCacheEntity = new EntityInsertionAdapter<ProductsCacheEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `products_cache` (`id`,`name`,`image`,`is_new`,`sell_count`,`actual_price`,`price`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductsCacheEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        final int _tmp;
        _tmp = value.is_new() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getSell_count());
        stmt.bindLong(6, value.getActual_price());
        stmt.bindLong(7, value.getPrice());
      }
    };
    this.__insertionAdapterOfFavoriteEntity = new EntityInsertionAdapter<FavoriteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorites` (`id`,`name`,`image`,`is_new`,`sell_count`,`actual_price`,`price`,`isFavorite`,`regFavoriteTime`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        final int _tmp;
        _tmp = value.is_new() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getSell_count());
        stmt.bindLong(6, value.getActual_price());
        stmt.bindLong(7, value.getPrice());
        final int _tmp_1;
        _tmp_1 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp_1);
        stmt.bindLong(9, value.getRegFavoriteTime());
      }
    };
    this.__deletionAdapterOfFavoriteEntity = new EntityDeletionOrUpdateAdapter<FavoriteEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorites` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfClearProductCache = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM products_cache";
        return _query;
      }
    };
  }

  @Override
  public Object insertProductsCache(final ProductsCacheEntity[] productsForCache,
      final Continuation<? super long[]> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<long[]>() {
      @Override
      public long[] call() throws Exception {
        __db.beginTransaction();
        try {
          long[] _result = __insertionAdapterOfProductsCacheEntity.insertAndReturnIdsArray(productsForCache);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertFavorite(final FavoriteEntity favorite,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfFavoriteEntity.insertAndReturnId(favorite);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteFavorite(final FavoriteEntity favorite,
      final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfFavoriteEntity.handle(favorite);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearProductCache(final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearProductCache.acquire();
        __db.beginTransaction();
        try {
          final java.lang.Integer _result = _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearProductCache.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object selectAllProducts(final Continuation<? super List<ProductsEntity>> continuation) {
    final String _sql = "SELECT * FROM products ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ProductsEntity>>() {
      @Override
      public List<ProductsEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfIsNew = CursorUtil.getColumnIndexOrThrow(_cursor, "is_new");
          final int _cursorIndexOfSellCount = CursorUtil.getColumnIndexOrThrow(_cursor, "sell_count");
          final int _cursorIndexOfActualPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "actual_price");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfRegFavoriteTime = CursorUtil.getColumnIndexOrThrow(_cursor, "regFavoriteTime");
          final List<ProductsEntity> _result = new ArrayList<ProductsEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductsEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final boolean _tmpIs_new;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsNew);
            _tmpIs_new = _tmp != 0;
            final int _tmpSell_count;
            _tmpSell_count = _cursor.getInt(_cursorIndexOfSellCount);
            final int _tmpActual_price;
            _tmpActual_price = _cursor.getInt(_cursorIndexOfActualPrice);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final long _tmpRegFavoriteTime;
            _tmpRegFavoriteTime = _cursor.getLong(_cursorIndexOfRegFavoriteTime);
            _item = new ProductsEntity(_tmpId,_tmpName,_tmpImage,_tmpIs_new,_tmpSell_count,_tmpActual_price,_tmpPrice,_tmpIsFavorite,_tmpRegFavoriteTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object selectAllFavorites(final Continuation<? super List<FavoriteEntity>> continuation) {
    final String _sql = "SELECT * FROM favorites ORDER BY regFavoriteTime";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FavoriteEntity>>() {
      @Override
      public List<FavoriteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfIsNew = CursorUtil.getColumnIndexOrThrow(_cursor, "is_new");
          final int _cursorIndexOfSellCount = CursorUtil.getColumnIndexOrThrow(_cursor, "sell_count");
          final int _cursorIndexOfActualPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "actual_price");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfRegFavoriteTime = CursorUtil.getColumnIndexOrThrow(_cursor, "regFavoriteTime");
          final List<FavoriteEntity> _result = new ArrayList<FavoriteEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavoriteEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final boolean _tmpIs_new;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsNew);
            _tmpIs_new = _tmp != 0;
            final int _tmpSell_count;
            _tmpSell_count = _cursor.getInt(_cursorIndexOfSellCount);
            final int _tmpActual_price;
            _tmpActual_price = _cursor.getInt(_cursorIndexOfActualPrice);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final boolean _tmpIsFavorite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_1 != 0;
            final long _tmpRegFavoriteTime;
            _tmpRegFavoriteTime = _cursor.getLong(_cursorIndexOfRegFavoriteTime);
            _item = new FavoriteEntity(_tmpId,_tmpName,_tmpImage,_tmpIs_new,_tmpSell_count,_tmpActual_price,_tmpPrice,_tmpIsFavorite,_tmpRegFavoriteTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object selectAllProductCache(
      final Continuation<? super List<ProductsCacheEntity>> continuation) {
    final String _sql = "SELECT * FROM products_cache";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ProductsCacheEntity>>() {
      @Override
      public List<ProductsCacheEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfIsNew = CursorUtil.getColumnIndexOrThrow(_cursor, "is_new");
          final int _cursorIndexOfSellCount = CursorUtil.getColumnIndexOrThrow(_cursor, "sell_count");
          final int _cursorIndexOfActualPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "actual_price");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final List<ProductsCacheEntity> _result = new ArrayList<ProductsCacheEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductsCacheEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final boolean _tmpIs_new;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsNew);
            _tmpIs_new = _tmp != 0;
            final int _tmpSell_count;
            _tmpSell_count = _cursor.getInt(_cursorIndexOfSellCount);
            final int _tmpActual_price;
            _tmpActual_price = _cursor.getInt(_cursorIndexOfActualPrice);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            _item = new ProductsCacheEntity(_tmpId,_tmpName,_tmpImage,_tmpIs_new,_tmpSell_count,_tmpActual_price,_tmpPrice);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
