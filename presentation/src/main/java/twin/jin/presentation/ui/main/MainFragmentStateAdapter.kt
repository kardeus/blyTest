package twin.jin.presentation.ui.main

import androidx.collection.SparseArrayCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import twin.jin.presentation.ui.base.BaseFragment
import twin.jin.presentation.ui.favorite.FavoriteFragment
import twin.jin.presentation.ui.home.HomeFragment

/**
 * Main Menu Fragment Adapter
 * Created by jin on 2021/09/25.
 */
class MainFragmentStateAdapter(
    supportFragmentManager: FragmentManager,
    lifecycle: Lifecycle
): FragmentStateAdapter(supportFragmentManager, lifecycle) {

    private val fragments = SparseArrayCompat<BaseFragment<*>>().apply {
        put(0, HomeFragment())
        put(1, FavoriteFragment())
    }

    override fun getItemCount() = fragments.size()

    override fun createFragment(position: Int) = fragments[position] ?: when(position) {
        0 -> HomeFragment()
        1 -> FavoriteFragment()
        else -> Fragment()
    }

}