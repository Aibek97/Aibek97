package com.example.washdriver2.ui.book.appointment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.washdriver2.R
import com.example.washdriver2.ui.book.queue.QueueAdapter
import kotlinx.android.synthetic.main.appointment_fragment.*
import kotlinx.android.synthetic.main.queue_fragment.*

class AppointmentFragment : Fragment(R.layout.appointment_fragment){

    private val orderAdapter by lazy { AppointmentAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerAppointment.adapter = orderAdapter

        val results = mutableListOf<MyBooks>()
        results.add(MyBooks("mac", "34", "sedan"))
        results.add(MyBooks("mac1", "45", "fre"))
        results.add(MyBooks("ma2c", "6", "gtr"))
        results.add(MyBooks("mac3", "32", "wer"))


        //val results = listOf("Макгрегогор","Конор","Жузеппа","Верди")

        orderAdapter.submitList(results)
    }
}

data class MyBooks(
    val name: String,
    val time: String,
    val car: String
)