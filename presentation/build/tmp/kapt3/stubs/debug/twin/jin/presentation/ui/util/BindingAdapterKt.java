package twin.jin.presentation.ui.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bH\u0007\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0013H\u0007\u00a8\u0006\u001a"}, d2 = {"addItemDecoration", "", "Landroidx/recyclerview/widget/RecyclerView;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "imagePath", "Landroid/widget/ImageView;", "", "setBanner", "Ltwin/jin/presentation/ui/banner/BannerView;", "banners", "", "Ltwin/jin/domain/data/BannerUiData;", "setItems", "items", "", "setSelected", "Landroidx/appcompat/widget/AppCompatImageView;", "isSelected", "", "setViewRoundRadius", "Landroid/view/View;", "radius", "", "setVisibility", "isVisible", "presentation_debug"})
public final class BindingAdapterKt {
    
    /**
     * Created by jin on 2021/09/23.
     */
    @androidx.databinding.BindingAdapter(value = {"imagePath"})
    public static final void imagePath(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$imagePath, @org.jetbrains.annotations.Nullable()
    java.lang.String imagePath) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isSelected"})
    public static final void setSelected(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$setSelected, boolean isSelected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setViewRoundRadius"})
    public static final void setViewRoundRadius(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setViewRoundRadius, float radius) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:visibility"})
    public static final void setVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setVisibility, boolean isVisible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setItems"})
    public static final void setItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setItems, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"addItemDecoration"})
    public static final void addItemDecoration(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$addItemDecoration, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ItemDecoration itemDecoration) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setBanner"})
    public static final void setBanner(@org.jetbrains.annotations.NotNull()
    twin.jin.presentation.ui.banner.BannerView $this$setBanner, @org.jetbrains.annotations.Nullable()
    java.util.List<twin.jin.domain.data.BannerUiData> banners) {
    }
}