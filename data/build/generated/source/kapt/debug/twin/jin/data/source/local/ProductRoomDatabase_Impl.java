package twin.jin.data.source.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.room.util.ViewInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductRoomDatabase_Impl extends ProductRoomDatabase {
  private volatile ProductQuery _productQuery;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `products_cache` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `image` TEXT, `is_new` INTEGER NOT NULL, `sell_count` INTEGER NOT NULL, `actual_price` INTEGER NOT NULL, `price` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorites` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `image` TEXT, `is_new` INTEGER NOT NULL, `sell_count` INTEGER NOT NULL, `actual_price` INTEGER NOT NULL, `price` INTEGER NOT NULL, `isFavorite` INTEGER NOT NULL, `regFavoriteTime` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE VIEW `products` AS SELECT products_cache.id, products_cache.name, products_cache.image, products_cache.is_new, products_cache.sell_count, products_cache.actual_price, products_cache.price, favorites.isFavorite, favorites.regFavoriteTime FROM products_cache LEFT JOIN favorites ON products_cache.id = favorites.id");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'edb8181c5a0d1efc6c295e0de06b9e4e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `products_cache`");
        _db.execSQL("DROP TABLE IF EXISTS `favorites`");
        _db.execSQL("DROP VIEW IF EXISTS `products`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProductsCache = new HashMap<String, TableInfo.Column>(7);
        _columnsProductsCache.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsCache.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsCache.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsCache.put("is_new", new TableInfo.Column("is_new", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsCache.put("sell_count", new TableInfo.Column("sell_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsCache.put("actual_price", new TableInfo.Column("actual_price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductsCache.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProductsCache = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProductsCache = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProductsCache = new TableInfo("products_cache", _columnsProductsCache, _foreignKeysProductsCache, _indicesProductsCache);
        final TableInfo _existingProductsCache = TableInfo.read(_db, "products_cache");
        if (! _infoProductsCache.equals(_existingProductsCache)) {
          return new RoomOpenHelper.ValidationResult(false, "products_cache(twin.jin.data.model.ProductsCacheEntity).\n"
                  + " Expected:\n" + _infoProductsCache + "\n"
                  + " Found:\n" + _existingProductsCache);
        }
        final HashMap<String, TableInfo.Column> _columnsFavorites = new HashMap<String, TableInfo.Column>(9);
        _columnsFavorites.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("is_new", new TableInfo.Column("is_new", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("sell_count", new TableInfo.Column("sell_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("actual_price", new TableInfo.Column("actual_price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorites.put("regFavoriteTime", new TableInfo.Column("regFavoriteTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavorites = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavorites = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavorites = new TableInfo("favorites", _columnsFavorites, _foreignKeysFavorites, _indicesFavorites);
        final TableInfo _existingFavorites = TableInfo.read(_db, "favorites");
        if (! _infoFavorites.equals(_existingFavorites)) {
          return new RoomOpenHelper.ValidationResult(false, "favorites(twin.jin.data.model.FavoriteEntity).\n"
                  + " Expected:\n" + _infoFavorites + "\n"
                  + " Found:\n" + _existingFavorites);
        }
        final ViewInfo _infoProducts = new ViewInfo("products", "CREATE VIEW `products` AS SELECT products_cache.id, products_cache.name, products_cache.image, products_cache.is_new, products_cache.sell_count, products_cache.actual_price, products_cache.price, favorites.isFavorite, favorites.regFavoriteTime FROM products_cache LEFT JOIN favorites ON products_cache.id = favorites.id");
        final ViewInfo _existingProducts = ViewInfo.read(_db, "products");
        if (! _infoProducts.equals(_existingProducts)) {
          return new RoomOpenHelper.ValidationResult(false, "products(twin.jin.data.model.ProductsEntity).\n"
                  + " Expected:\n" + _infoProducts + "\n"
                  + " Found:\n" + _existingProducts);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "edb8181c5a0d1efc6c295e0de06b9e4e", "51b15008d142f70008490d297f860c09");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(1);
    HashSet<String> _tables = new HashSet<String>(2);
    _tables.add("products_cache");
    _tables.add("favorites");
    _viewTables.put("products", _tables);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "products_cache","favorites");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `products_cache`");
      _db.execSQL("DELETE FROM `favorites`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ProductQuery.class, ProductQuery_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ProductQuery productQuery() {
    if (_productQuery != null) {
      return _productQuery;
    } else {
      synchronized(this) {
        if(_productQuery == null) {
          _productQuery = new ProductQuery_Impl(this);
        }
        return _productQuery;
      }
    }
  }
}
