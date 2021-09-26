package twin.jin.presentation.databinding;
import twin.jin.presentation.R;
import twin.jin.presentation.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (twin.jin.presentation.ui.banner.BannerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            );
        this.bannerView.setTag(null);
        this.rvProduct.setTag(null);
        this.swipeRefresh.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((twin.jin.presentation.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable twin.jin.presentation.ui.home.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelBanners((androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.BannerUiData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelBanners(androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.BannerUiData>> ViewModelBanners, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.util.List<twin.jin.domain.data.BannerUiData>> viewModelBanners = null;
        twin.jin.presentation.ui.home.HomeViewModel viewModel = mViewModel;
        java.util.List<twin.jin.domain.data.BannerUiData> viewModelBannersGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.banners
                    viewModelBanners = viewModel.getBanners();
                }
                updateLiveDataRegistration(0, viewModelBanners);


                if (viewModelBanners != null) {
                    // read viewModel.banners.getValue()
                    viewModelBannersGetValue = viewModelBanners.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            twin.jin.presentation.ui.util.BindingAdapterKt.setBanner(this.bannerView, viewModelBannersGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            twin.jin.presentation.ui.util.BindingAdapterKt.addItemDecoration(this.rvProduct, twin.jin.common.widget.recycler.RecyclerViewFactory.getGridItemDecoration(rvProduct.getResources().getDimension(R.dimen.grid_item_margin)));
            this.rvProduct.setLayoutManager(twin.jin.common.widget.recycler.RecyclerViewFactory.getGridLayoutManager(getRoot().getContext(), 2));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.banners
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}