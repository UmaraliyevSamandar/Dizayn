package com.example.a00008.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a00008.ElevenActivity2
import com.example.a00008.databinding.TenItemLayoutBinding
import com.example.a00008.model.TenModel

class TenAdapter(val items: List<TenModel>): RecyclerView.Adapter<TenAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: TenItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(TenItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]

        holder.binding.month.text = item.month
        holder.binding.kg.text = item.kg
        holder.itemView.setOnClickListener {
            holder.itemView.context.startActivity(Intent(holder.itemView.context, ElevenActivity2::class.java))
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }

}