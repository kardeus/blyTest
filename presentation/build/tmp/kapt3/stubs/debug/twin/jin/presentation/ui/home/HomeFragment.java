package twin.jin.presentation.ui.home;

import java.lang.System;

/**
 * Created by jin on 2021/09/23.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Ltwin/jin/presentation/ui/home/HomeFragment;", "Ltwin/jin/presentation/ui/base/BaseFragment;", "Ltwin/jin/presentation/databinding/FragmentHomeBinding;", "()V", "productAdapter", "Ltwin/jin/presentation/ui/util/ItemBindingPagingDataAdapter;", "Ltwin/jin/domain/data/ProductUiData;", "Ltwin/jin/presentation/databinding/ListItemProductBinding;", "productPagingJob", "Lkotlinx/coroutines/Job;", "sharedSharedViewModel", "Ltwin/jin/presentation/ui/main/MainSharedViewModel;", "getSharedSharedViewModel", "()Ltwin/jin/presentation/ui/main/MainSharedViewModel;", "sharedSharedViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Ltwin/jin/presentation/ui/home/HomeViewModel;", "getViewModel", "()Ltwin/jin/presentation/ui/home/HomeViewModel;", "viewModel$delegate", "initLayout", "", "observeData", "toggleFavorite", "view", "Landroid/view/View;", "position", "", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
@javax.inject.Singleton()
public final class HomeFragment extends twin.jin.presentation.ui.base.BaseFragment<twin.jin.presentation.databinding.FragmentHomeBinding> {
    private final kotlin.Lazy sharedSharedViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private kotlinx.coroutines.Job productPagingJob;
    private final twin.jin.presentation.ui.util.ItemBindingPagingDataAdapter<twin.jin.domain.data.ProductUiData, twin.jin.presentation.databinding.ListItemProductBinding> productAdapter = null;
    
    public HomeFragment() {
        super(0);
    }
    
    private final twin.jin.presentation.ui.main.MainSharedViewModel getSharedSharedViewModel() {
        return null;
    }
    
    private final twin.jin.presentation.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initLayout() {
    }
    
    private final void observeData() {
    }
    
    /**
     * 즐겨찾기 갱신
     */
    private final void toggleFavorite(android.view.View view, int position) {
    }
}