package com.example.a00008.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a00008.databinding.AdapterItemLayoutBinding
import com.example.a00008.oltiActivity2
import com.example.a00008.model.Model

class Adapter (val items:List<Model>):RecyclerView.Adapter<Adapter.ItemHolder>(){
    inner class ItemHolder(val binding: AdapterItemLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(AdapterItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.binding.text.text = item.title
        holder.binding.number.text = item.price
        holder.binding.text1.text = item.convert

        holder.itemView.setOnClickListener {
            holder.itemView.context.startActivity(Intent(holder.itemView.context,oltiActivity2::class.java))
        }

    }

    override fun getItemCount(): Int {
        return items.count()

    }
}