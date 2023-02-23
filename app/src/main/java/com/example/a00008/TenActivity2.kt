package com.example.a00008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a00008.databinding.ActivityTen2Binding
import com.example.a00008.view.TenAdapter
import com.example.a00008.model.TenModel

class TenActivity2 : AppCompatActivity() {
    var item = listOf(

        TenModel("January","12 kg"),
        TenModel("February","12 kg"),
        TenModel("March","12 kg"),
        TenModel("April","12 kg"),
        TenModel("May","12 kg"),
        TenModel("June","12 kg"),
        TenModel("July","12 kg"),
        TenModel("August","12 kg"),
        TenModel("September","12 kg"),
        TenModel("October","12 kg"),
        TenModel("November","12 kg"),
        TenModel("December","12 kg"),
    )
    lateinit var binding: ActivityTen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler2.layoutManager = LinearLayoutManager(this)
        binding.recycler2.adapter = TenAdapter(item)
    }
}