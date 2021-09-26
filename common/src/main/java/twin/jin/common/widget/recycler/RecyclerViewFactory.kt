package twin.jin.common.widget.recycler

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager

/**
 * Created by jin on 2021/09/25.
 */
object RecyclerViewFactory {

    @JvmStatic
    @JvmOverloads
    fun getGridLayoutManager(
        context: Context,
        spanCount: Int
    ) = GridLayoutManager(
        context,
        spanCount
    )

    @JvmStatic
    @JvmOverloads
    fun getGridItemDecoration(
        spacing: Float
    ) = GridSpacingItemDecoration(spacing, false, true)
}