package twin.jin.presentation.ui.main;

import java.lang.System;

/**
 * Main Activity
 * Created by jin on 2021/09/23.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Ltwin/jin/presentation/ui/main/MainActivity;", "Ltwin/jin/presentation/ui/base/BaseActivity;", "Ltwin/jin/presentation/databinding/ActivityMainBinding;", "Ltwin/jin/presentation/ui/main/MainSharedViewModel;", "()V", "mPagerAdapter", "Ltwin/jin/presentation/ui/main/MainFragmentStateAdapter;", "viewModel", "getViewModel", "()Ltwin/jin/presentation/ui/main/MainSharedViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initLayout", "", "initNavi", "setActionBarTitle", "position", "", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends twin.jin.presentation.ui.base.BaseActivity<twin.jin.presentation.databinding.ActivityMainBinding, twin.jin.presentation.ui.main.MainSharedViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private twin.jin.presentation.ui.main.MainFragmentStateAdapter mPagerAdapter;
    
    public MainActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected twin.jin.presentation.ui.main.MainSharedViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initLayout() {
    }
    
    private final void setActionBarTitle(int position) {
    }
    
    /**
     * 새로고침 이슈로 viewPager2로 세팅
     * BottomNavigation settup
     */
    private final void initNavi() {
    }
}