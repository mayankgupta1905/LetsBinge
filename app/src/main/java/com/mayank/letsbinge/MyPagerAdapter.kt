package com.mayank.letsbinge

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> Movies_ns_Fragment()
            1 -> Movies_Pop_Fragment()
            else -> Movies_Tr_Fragment()
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