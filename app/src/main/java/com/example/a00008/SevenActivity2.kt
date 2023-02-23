package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a00008.databinding.ActivityEight2Binding
import com.example.a00008.databinding.ActivitySeven2Binding

class SevenActivity2 : AppCompatActivity() {
    lateinit var binding:ActivitySeven2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeven2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this,EightActivity2::class.java))
        }


    }
}