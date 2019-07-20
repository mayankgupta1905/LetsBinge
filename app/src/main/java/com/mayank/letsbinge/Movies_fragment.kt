package com.mayank.letsbinge


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.movies.*


class Movies_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.movies,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = MyPagerAdapter(fragmentManager)
        viewpager_movies.adapter = adapter
        tab_movies.setupWithViewPager(viewpager_movies)
        viewpager_movies.offscreenPageLimit = 3
    }
}
