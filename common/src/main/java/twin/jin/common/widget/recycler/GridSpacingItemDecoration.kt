package twin.jin.common.widget.recycler

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by jin on 2021/09/25.
 */
class GridSpacingItemDecoration(
    margin: Float = 0.0f,
    private val includeEdge: Boolean = false,
    private val includeTop: Boolean = false
): RecyclerView.ItemDecoration() {

    private var spacing: Int = margin.toInt()

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        try{
            val position = parent.getChildAdapterPosition(view)
            val manager = parent.layoutManager as GridLayoutManager
            val spanSizeLookup = manager.spanSizeLookup
            val spanCount = spanSizeLookup.getSpanSize(position)

            val numColumn = manager.spanCount

            if(includeEdge) {
                outRect.left = spacing - numColumn * spacing / spanCount
                outRect.right = (numColumn + 1) * spacing / spanCount

                if(position < spanCount) {
                    outRect.top = spacing
                }
                outRect.bottom = spacing
            } else {
                if(numColumn > 1 && spanCount == 1) {
                    var offsetFromHeader = 0
                    for (i in position - 1 downTo 0) {
                        if (spanSizeLookup!!.getSpanSize(i) == 1) {
                            offsetFromHeader++
                        } else {
                            break
                        }
                    }
                    val column = offsetFromHeader % numColumn
                    outRect.left = column * (spacing / numColumn)
                    outRect.right = spacing - (column + 1) * (spacing / numColumn)
                    if (offsetFromHeader >= numColumn) {
                        // only add top when we are 3rd card onwards
                        if (includeTop) {
                            outRect.top = spacing
                        }
                    }
                } else if(position > 0) {
                    outRect.top = spacing
                }
            }
        }catch (e: Exception) {
            e.printStackTrace()
        }

    }
}