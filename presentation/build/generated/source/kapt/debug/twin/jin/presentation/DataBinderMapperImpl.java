package twin.jin.presentation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import twin.jin.presentation.databinding.ActivityMainBindingImpl;
import twin.jin.presentation.databinding.CellBannerBindingImpl;
import twin.jin.presentation.databinding.FragmentFavoriteBindingImpl;
import twin.jin.presentation.databinding.FragmentHomeBindingImpl;
import twin.jin.presentation.databinding.ListBannerBindingImpl;
import twin.jin.presentation.databinding.ListItemProductBindingImpl;
import twin.jin.presentation.databinding.ListItemProductFavoriteBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_CELLBANNER = 2;

  private static final int LAYOUT_FRAGMENTFAVORITE = 3;

  private static final int LAYOUT_FRAGMENTHOME = 4;

  private static final int LAYOUT_LISTBANNER = 5;

  private static final int LAYOUT_LISTITEMPRODUCT = 6;

  private static final int LAYOUT_LISTITEMPRODUCTFAVORITE = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(twin.jin.presentation.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(twin.jin.presentation.R.layout.cell_banner, LAYOUT_CELLBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(twin.jin.presentation.R.layout.fragment_favorite, LAYOUT_FRAGMENTFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(twin.jin.presentation.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(twin.jin.presentation.R.layout.list_banner, LAYOUT_LISTBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(twin.jin.presentation.R.layout.list_item_product, LAYOUT_LISTITEMPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(twin.jin.presentation.R.layout.list_item_product_favorite, LAYOUT_LISTITEMPRODUCTFAVORITE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CELLBANNER: {
          if ("layout/cell_banner_0".equals(tag)) {
            return new CellBannerBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for cell_banner is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITE: {
          if ("layout/fragment_favorite_0".equals(tag)) {
            return new FragmentFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTBANNER: {
          if ("layout/list_banner_0".equals(tag)) {
            return new ListBannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_banner is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPRODUCT: {
          if ("layout/list_item_product_0".equals(tag)) {
            return new ListItemProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_product is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPRODUCTFAVORITE: {
          if ("layout/list_item_product_favorite_0".equals(tag)) {
            return new ListItemProductFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_product_favorite is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_CELLBANNER: {
          if("layout/cell_banner_0".equals(tag)) {
            return new CellBannerBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for cell_banner is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new twin.jin.common.DataBinderMapperImpl());
    result.add(new twin.jin.domain.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "banner");
      sKeys.put(2, "product");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", twin.jin.presentation.R.layout.activity_main);
      sKeys.put("layout/cell_banner_0", twin.jin.presentation.R.layout.cell_banner);
      sKeys.put("layout/fragment_favorite_0", twin.jin.presentation.R.layout.fragment_favorite);
      sKeys.put("layout/fragment_home_0", twin.jin.presentation.R.layout.fragment_home);
      sKeys.put("layout/list_banner_0", twin.jin.presentation.R.layout.list_banner);
      sKeys.put("layout/list_item_product_0", twin.jin.presentation.R.layout.list_item_product);
      sKeys.put("layout/list_item_product_favorite_0", twin.jin.presentation.R.layout.list_item_product_favorite);
    }
  }
}
