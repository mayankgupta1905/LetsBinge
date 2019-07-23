package com.mayank.letsbinge.Tv_shows

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TvPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> Tv_ns_Fragment()
            1 -> Tv_pop_Fragment()
            else -> Tv_tr_Fragment()
        }
    }

    override fun getCount(): Int = 3

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Now Showing"
            1 -> "Popular"
            else -> "Top Rated"
        }
    }
}

