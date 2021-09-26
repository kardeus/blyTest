package twin.jin.presentation.databinding;
import twin.jin.presentation.R;
import twin.jin.presentation.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemProductBindingImpl extends ListItemProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListItemProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.discountRate.setTag(null);
        this.image.setTag(null);
        this.like.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.newBadge.setTag(null);
        this.price.setTag(null);
        this.sellCount.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.product == variableId) {
            setProduct((twin.jin.domain.data.ProductUiData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable twin.jin.domain.data.ProductUiData Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String productImage = null;
        java.lang.String productName = null;
        twin.jin.domain.data.ProductUiData product = mProduct;
        int productPrice = 0;
        int productPricePercent = 0;
        java.lang.String discountRateAndroidStringDiscountFormatProductPricePercent = null;
        boolean productPriceInt0 = false;
        java.lang.String sellCountAndroidStringSellCountFormatProductSellCount = null;
        java.lang.String priceAndroidStringPriceFormatProductPrice = null;
        boolean productPricePercentInt0 = false;
        boolean productIsNew = false;
        boolean productIsFavorite = false;
        int productSellCount = 0;
        boolean productSellCountInt0 = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.image
                    productImage = product.getImage();
                    // read product.name
                    productName = product.getName();
                    // read product.price
                    productPrice = product.getPrice();
                    // read product.pricePercent
                    productPricePercent = product.getPricePercent();
                    // read product.is_new
                    productIsNew = product.is_new();
                    // read product.isFavorite
                    productIsFavorite = product.isFavorite();
                    // read product.sell_count
                    productSellCount = product.getSell_count();
                }


                // read product.price > 0
                productPriceInt0 = (productPrice) > (0);
                // read @android:string/price_format
                priceAndroidStringPriceFormatProductPrice = price.getResources().getString(R.string.price_format, productPrice);
                // read @android:string/discount_format
                discountRateAndroidStringDiscountFormatProductPricePercent = discountRate.getResources().getString(R.string.discount_format, productPricePercent);
                // read product.pricePercent > 0
                productPricePercentInt0 = (productPricePercent) > (0);
                // read @android:string/sell_count_format
                sellCountAndroidStringSellCountFormatProductSellCount = sellCount.getResources().getString(R.string.sell_count_format, productSellCount);
                // read product.sell_count > 0
                productSellCountInt0 = (productSellCount) > (0);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.discountRate, discountRateAndroidStringDiscountFormatProductPricePercent);
            twin.jin.presentation.ui.util.BindingAdapterKt.setVisibility(this.discountRate, productPricePercentInt0);
            twin.jin.presentation.ui.util.BindingAdapterKt.imagePath(this.image, productImage);
            twin.jin.presentation.ui.util.BindingAdapterKt.setSelected(this.like, productIsFavorite);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, productName);
            twin.jin.presentation.ui.util.BindingAdapterKt.setVisibility(this.newBadge, productIsNew);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, priceAndroidStringPriceFormatProductPrice);
            twin.jin.presentation.ui.util.BindingAdapterKt.setVisibility(this.price, productPriceInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sellCount, sellCountAndroidStringSellCountFormatProductSellCount);
            twin.jin.presentation.ui.util.BindingAdapterKt.setVisibility(this.sellCount, productSellCountInt0);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            twin.jin.presentation.ui.util.BindingAdapterKt.setViewRoundRadius(this.image, image.getResources().getDimension(R.dimen.image_radius));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}