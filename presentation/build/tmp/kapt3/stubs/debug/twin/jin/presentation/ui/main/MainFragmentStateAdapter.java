package twin.jin.presentation.ui.main;

import java.lang.System;

/**
 * Main Menu Fragment Adapter
 * Created by jin on 2021/09/25.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ltwin/jin/presentation/ui/main/MainFragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "fragments", "Landroidx/collection/SparseArrayCompat;", "Ltwin/jin/presentation/ui/base/BaseFragment;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "presentation_debug"})
public final class MainFragmentStateAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final androidx.collection.SparseArrayCompat<twin.jin.presentation.ui.base.BaseFragment<?>> fragments = null;
    
    public MainFragmentStateAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragmentManager, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifecycle) {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
}