package com.example.washdriver2.ui.book.appointment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.washdriver2.R
import com.example.washdriver2.databinding.AppointmentAdapterBinding
import com.example.washdriver2.ui.book.queue.MyBook
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class AppointmentAdapter() : ListAdapter<MyBooks, AppointmentViewHolder>(AppointmentDiffUtil()) {

    var onItemClicked: ((MyBooks) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppointmentViewHolder {
        val binding: AppointmentAdapterBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.appointment_adapter,
            parent,
            false
        )
        return AppointmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AppointmentViewHolder, position: Int) {
        holder.bind(getItem(position))
        //holder.binding.orderList = getItem(position)

        val character = getItem(position)
        holder.binding.root.setOnClickListener {
            onItemClicked?.invoke(character)
        }
    }
}
class AppointmentViewHolder(val binding: AppointmentAdapterBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: MyBooks) {

        binding.aqutext.text = item.name
        binding.boxTextView.text = item.time
        binding.nameTextView.text = item.car


        val results = mutableListOf<MyBooks>()
        results.add(MyBooks("mac", "34", "sedan"))
        results.add(MyBooks("mac1", "45", "fre"))
        results.add(MyBooks("ma2c", "6", "gtr"))
        results.add(MyBooks("mac3", "32", "wer"))

        val policyItemAdapter = AppointmentItemAdapter(results.toList())

        binding.serviceRv.adapter = policyItemAdapter
        //policyItemAdapter.submitList(policyAccident.accident.insured)

    }
}

class AppointmentDiffUtil : DiffUtil.ItemCallback<MyBooks>() {

    override fun areItemsTheSame(
        oldItem: MyBooks,
        newItem: MyBooks
    ): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: MyBooks,
        newItem: MyBooks
    ): Boolean {
        return oldItem == newItem
    }
}