package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a00008.databinding.ActivityOlti2Binding

class oltiActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityOlti2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOlti2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextActivity.setOnClickListener {
            startActivity(Intent(this,SevenActivity2::class.java))
        }
    }
}