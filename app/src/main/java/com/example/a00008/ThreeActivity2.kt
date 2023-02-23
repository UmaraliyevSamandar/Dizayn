package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a00008.databinding.ActivityFour2Binding
import com.example.a00008.databinding.ActivityThree2Binding

class ThreeActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityThree2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThree2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            startActivity(Intent(this,FourActivity2::class.java))
        }
    }
}