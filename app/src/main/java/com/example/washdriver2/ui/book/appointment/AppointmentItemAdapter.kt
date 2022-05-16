package com.example.washdriver2.ui.book.appointment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.washdriver2.R
import kotlinx.android.synthetic.main.appointment_item_adapter.view.*

class AppointmentItemAdapter (var cards: List<MyBooks>) :
    RecyclerView.Adapter<AppointmentItemAdapter.ServiceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
        val root = LayoutInflater.from(parent.context)
            .inflate(R.layout.appointment_item_adapter, parent, false)
        return ServiceViewHolder(root)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        holder.bind(cards[position], position)

    }

    class ServiceViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.name
        val time = view.time
        fun bind(item: MyBooks, position: Int) {
            name.text = item.name
            time.text = item.time +" м | "+item.car +" тг."

        }
    }
}