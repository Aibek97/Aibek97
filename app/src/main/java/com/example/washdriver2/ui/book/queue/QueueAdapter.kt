package com.example.washdriver2.ui.book.queue

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.washdriver2.R
import com.example.washdriver2.databinding.QueueAdapterBinding

class QueueAdapter() :
    ListAdapter<MyBook, QueueViewHolder>(QueueDiffUtil()) {

    var onItemClicked: ((MyBook) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QueueViewHolder {
        val binding: QueueAdapterBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.queue_adapter,
            parent,
            false)
        return QueueViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QueueViewHolder, position: Int) {
        holder.initContent(getItem(position))
        //holder.binding.orderList = getItem(position)

        val character = getItem(position)
        holder.binding.root.setOnClickListener {
            onItemClicked?.invoke(character)
        }
    }
}

class QueueViewHolder(val binding: QueueAdapterBinding) : RecyclerView.ViewHolder(binding.root) {

    fun initContent(item: MyBook) {

        binding.aquaboxText.text = item.name
        binding.freeText.text = item.time+" м"
        binding.carTextView.text = item.car
    }
}
class QueueDiffUtil : DiffUtil.ItemCallback<MyBook>() {

    override fun areItemsTheSame(
        oldItem: MyBook,
        newItem: MyBook
    ): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: MyBook,
        newItem: MyBook
    ): Boolean {
        return oldItem == newItem
    }
}
