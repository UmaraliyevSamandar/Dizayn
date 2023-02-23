package com.example.a00008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager

import com.example.a00008.databinding.ActivityNine2Binding
import com.example.a00008.view.NewsADapter
import com.example.a00008.model.NewsModel

class NineActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityNine2Binding

    var item = listOf(
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),
        NewsModel(null,null,null,0),




        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNine2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = GridLayoutManager(this,2)
        binding.recycler.adapter = NewsADapter(item)

    }
}