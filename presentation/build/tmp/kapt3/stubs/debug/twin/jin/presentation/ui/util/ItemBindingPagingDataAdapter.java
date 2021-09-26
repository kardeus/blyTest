package twin.jin.presentation.ui.util;

import java.lang.System;

/**
 * PagingAdapter 정의
 * Created by jin on 2021/09/25.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005:\u0001\u0019B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Ltwin/jin/presentation/ui/util/ItemBindingPagingDataAdapter;", "DATA", "", "BIND", "Landroidx/databinding/ViewDataBinding;", "Landroidx/paging/PagingDataAdapter;", "Ltwin/jin/presentation/ui/util/ItemBindingPagingDataAdapter$Holder;", "layoutResId", "", "itemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "brId", "(ILandroidx/recyclerview/widget/DiffUtil$ItemCallback;I)V", "getItemAtPosition", "position", "(I)Ljava/lang/Object;", "getItemView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "Holder", "presentation_debug"})
public class ItemBindingPagingDataAdapter<DATA extends java.lang.Object, BIND extends androidx.databinding.ViewDataBinding> extends androidx.paging.PagingDataAdapter<DATA, twin.jin.presentation.ui.util.ItemBindingPagingDataAdapter.Holder<BIND>> {
    private final int layoutResId = 0;
    private final int brId = 0;
    
    public ItemBindingPagingDataAdapter(int layoutResId, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<DATA> itemCallback, int brId) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public twin.jin.presentation.ui.util.ItemBindingPagingDataAdapter.Holder<BIND> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.view.View getItemView(@androidx.annotation.LayoutRes()
    int layoutResId, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    twin.jin.presentation.ui.util.ItemBindingPagingDataAdapter.Holder<BIND> holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final DATA getItemAtPosition(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u00028\u0002X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Ltwin/jin/presentation/ui/util/ItemBindingPagingDataAdapter$Holder;", "BIND", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "itemBinding", "getItemBinding", "()Landroidx/databinding/ViewDataBinding;", "setItemBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "presentation_debug"})
    public static final class Holder<BIND extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private BIND itemBinding;
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final BIND getItemBinding() {
            return null;
        }
        
        public final void setItemBinding(@org.jetbrains.annotations.NotNull()
        BIND p0) {
        }
    }
}