package com.example.washdriver2.ui.book

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.washdriver2.ui.book.appointment.AppointmentFragment
import com.example.washdriver2.ui.book.queue.QueueFragment

class MyBookViewPagerAdapter(manager: FragmentManager?, private val tabCount: Int) :
    FragmentStatePagerAdapter(manager!!, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
               QueueFragment()
            }
            1 -> {
                AppointmentFragment()
            }
            2 -> {
                QueueFragment()
            }
            else -> QueueFragment()
        }
    }

    override fun getCount() = tabCount
}