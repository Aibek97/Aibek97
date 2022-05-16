package com.example.washdriver2.ui.book.queue

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.washdriver2.R
import kotlinx.android.synthetic.main.queue_fragment.*

class QueueFragment :Fragment(R.layout.queue_fragment) {

    private val orderAdapter by lazy { QueueAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerQueue.adapter = orderAdapter

        val results = mutableListOf<MyBook>()
        results.add(MyBook("mac", "34", "sedan"))
        results.add(MyBook("mac1", "45", "fre"))
        results.add(MyBook("ma2c", "6", "gtr"))
        results.add(MyBook("mac3", "32", "wer"))


        //val results = listOf("Макгрегогор","Конор","Жузеппа","Верди")

        orderAdapter.submitList(results)
    }
}

data class MyBook(
    val name: String,
    val time: String,
    val car: String
)