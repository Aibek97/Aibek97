package com.example.washdriver2.ui.book

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.washdriver2.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.my_book_fragment.*

class MyBookFragment : Fragment(R.layout.my_book_fragment){


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewPager()

    }

    private fun setViewPager() {
        tabLayout.addTab(tabLayout.newTab())
        tabLayout.addTab(tabLayout.newTab())
        tabLayout.addTab(tabLayout.newTab())
        val viewPagerAdapter = MyBookViewPagerAdapter(childFragmentManager, tabLayout.tabCount)
        //pager.setPageTransformer(true, CubeTransformer())
        pager.adapter = viewPagerAdapter
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.setupWithViewPager(pager)
        tabLayout.getTabAt(0)?.text = "В очереди"
        tabLayout.getTabAt(1)?.text = "По записи"
        tabLayout.getTabAt(2)?.text = "Архив"
    }

}