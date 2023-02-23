package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a00008.databinding.ActivityFirst2Binding

class FirstActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityFirst2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirst2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btn.setOnClickListener {
            startActivity(Intent(this,SecondActivity2::class.java))
        }
    }
}