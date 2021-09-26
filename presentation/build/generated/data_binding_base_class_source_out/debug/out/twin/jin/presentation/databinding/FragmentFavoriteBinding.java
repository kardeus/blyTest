// Generated by data binding compiler. Do not edit!
package twin.jin.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import twin.jin.presentation.R;
import twin.jin.presentation.ui.main.MainSharedViewModel;

public abstract class FragmentFavoriteBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvProduct;

  @Bindable
  protected MainSharedViewModel mViewModel;

  protected FragmentFavoriteBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rvProduct) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvProduct = rvProduct;
  }

  public abstract void setViewModel(@Nullable MainSharedViewModel viewModel);

  @Nullable
  public MainSharedViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_favorite, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFavoriteBinding>inflateInternal(inflater, R.layout.fragment_favorite, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_favorite, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFavoriteBinding>inflateInternal(inflater, R.layout.fragment_favorite, null, false, component);
  }

  public static FragmentFavoriteBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentFavoriteBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFavoriteBinding)bind(component, view, R.layout.fragment_favorite);
  }
}
