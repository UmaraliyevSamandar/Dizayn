package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a00008.databinding.ActivityFive2Binding
import com.example.a00008.model.Model
import com.example.a00008.view.Adapter

class FiveActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityFive2Binding

    var item = listOf(

        Model("Plastic","5 kg","+12.50$",0),
        Model("Glass","7 kg","+7.25$",0),
        Model("Metal","10 kg","+15.50$",0),
        Model("Paper","3 kg","+1.75$",0),
        Model("Piastic","2 kg","+7.20$",0),
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFive2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = Adapter(item)

        binding.next.setOnClickListener {
            startActivity(Intent(this,oltiActivity2::class.java))
        }
    }
}