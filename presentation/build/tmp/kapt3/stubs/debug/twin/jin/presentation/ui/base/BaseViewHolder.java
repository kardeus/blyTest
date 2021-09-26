package twin.jin.presentation.ui.base;

import java.lang.System;

/**
 * Created by jin on 2021/09/25.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Ltwin/jin/presentation/ui/base/BaseViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/lifecycle/LifecycleOwner;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "variableId", "", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Integer;)V", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "Ljava/lang/Integer;", "variableMap", "", "", "getVariableMap", "()Ljava/util/Map;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onAppear", "", "onBind", "item", "(Ljava/lang/Object;)V", "onDestoryed", "onDisappear", "onRecycled", "onResume", "presentation_debug"})
public class BaseViewHolder<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements androidx.lifecycle.LifecycleOwner {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ViewDataBinding dataBinding = null;
    private final java.lang.Integer variableId = null;
    private final androidx.lifecycle.LifecycleRegistry lifecycleRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, java.lang.Object> variableMap = null;
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding dataBinding, @org.jetbrains.annotations.Nullable()
    java.lang.Integer variableId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.databinding.ViewDataBinding getDataBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.lang.Object> getVariableMap() {
        return null;
    }
    
    public final void onAppear() {
    }
    
    public final void onRecycled() {
    }
    
    public final void onDisappear() {
    }
    
    public final void onDestoryed() {
    }
    
    public final void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    public final void onBind(@org.jetbrains.annotations.Nullable()
    T item) {
    }
}