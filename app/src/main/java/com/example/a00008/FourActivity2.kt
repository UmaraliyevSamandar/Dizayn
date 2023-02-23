package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a00008.databinding.ActivityFive2Binding
import com.example.a00008.databinding.ActivityFour2Binding

class FourActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityFour2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFour2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frame.setOnClickListener {
            startActivity(Intent(this,FiveActivity2::class.java))
        }
    }
}