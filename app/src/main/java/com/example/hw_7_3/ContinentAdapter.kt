package com.example.hw_7_3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.hw_7_3.databinding.ItemContinentBinding

class ContinentAdapter(private val items: List<ContinentModel>,
                       private val onClick: OnClick) :
    RecyclerView.Adapter<ContinentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemContinentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            onClick.onClick(item)
        }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(private val binding: ItemContinentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ContinentModel) {
            binding.ivContinent.load(item.image)
        }
    }
}