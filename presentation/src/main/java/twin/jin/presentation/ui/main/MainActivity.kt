package twin.jin.presentation.ui.main

import androidx.activity.viewModels
import androidx.viewpager2.widget.ViewPager2
import dagger.hilt.android.AndroidEntryPoint
import twin.jin.presentation.R
import twin.jin.presentation.databinding.ActivityMainBinding
import twin.jin.presentation.ui.base.BaseActivity

/**
 * Main Activity
 * Created by jin on 2021/09/23.
 */
@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainSharedViewModel>(
    layoutRes = R.layout.activity_main
) {

    override val viewModel: MainSharedViewModel by viewModels()

    private var mPagerAdapter:MainFragmentStateAdapter? = null

    override fun initLayout() {
        with(binding.vpHome) {
            adapter ?: run {
                mPagerAdapter = MainFragmentStateAdapter(supportFragmentManager, lifecycle)
                this.adapter = mPagerAdapter
                offscreenPageLimit = 1
                isUserInputEnabled = false
            }
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    setActionBarTitle(position)
                }
            })
        }
        initNavi()
    }

    private fun setActionBarTitle(position: Int) {
        val titleId = when(position) {
            0 -> R.string.title_home
            1 -> R.string.title_favorite
            else -> R.string.app_name
        }
        val actionBar = supportActionBar
        actionBar?.title = getString(titleId)
    }

    /**
     * 새로고침 이슈로 viewPager2로 세팅
     * BottomNavigation settup
     * */
    private fun initNavi() {
        binding.navView.setOnItemSelectedListener { menu ->
            val page = when(menu.itemId) {
                R.id.navigation_home -> 0
                R.id.navigation_favorite -> 1
                else -> return@setOnItemSelectedListener false
            }
            binding.vpHome.setCurrentItem(page, false)

            true
        }
    }

}