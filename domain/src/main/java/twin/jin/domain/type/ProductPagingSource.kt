package twin.jin.domain.type

import androidx.paging.PagingSource
import twin.jin.domain.data.ProductUiData

/**
 * PaingSource type정의
 * Created by jin on 2021/09/23.
 */
typealias ProductPagingSource = PagingSource<Int, ProductUiData>