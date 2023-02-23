package com.example.a00008.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a00008.TenActivity2
import com.example.a00008.databinding.NewsItemLayoutBinding
import com.example.a00008.model.NewsModel


class NewsADapter(val items: List<NewsModel>): RecyclerView.Adapter<NewsADapter.ItemHolder>(){
    inner class ItemHolder(val binding: NewsItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(NewsItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.itemView.setOnClickListener {
            holder.itemView.context.startActivity(Intent(holder.itemView.context, TenActivity2::class.java))
        }
    }

    override fun getItemCount(): Int {
        return items.count()

    }
}