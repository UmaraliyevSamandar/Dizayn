package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a00008.databinding.ActivityEight2Binding

class EightActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityEight2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEight2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.next.setOnClickListener {
            startActivity(Intent(this,NineActivity2::class.java))
        }
    }
}