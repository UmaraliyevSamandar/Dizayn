package com.example.a00008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.a00008.databinding.ActivitySecond2Binding
import com.example.a00008.screen.menu_Oxirgi.Menu_oxirgiFragment
import com.example.a00008.screen.alarm.AlarmFragment
import com.example.a00008.screen.grass.GrassFragment
import com.example.a00008.screen.menu.MenuFragment
import com.example.a00008.screen.profile.ProfileFragment

class SecondActivity2 : AppCompatActivity() {
    lateinit var binding:ActivitySecond2Binding

    val alarmFragment = AlarmFragment.newInstance()
    val grassFragment = GrassFragment.newInstance()
    val menuFragment = MenuFragment.newInstance()
    val profileFragment = ProfileFragment.newInstance()
    val menuOxirgifragment = Menu_oxirgiFragment.newInstance()

    var activeFragment: Fragment = menuFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        supportFragmentManager.beginTransaction()
            .add(R.id.flContainer, alarmFragment, alarmFragment.tag).hide(alarmFragment).commit()
        supportFragmentManager.beginTransaction()
            .add(R.id.flContainer, grassFragment, grassFragment.tag).hide(grassFragment)
            .commit()
        supportFragmentManager.beginTransaction()
            .add(R.id.flContainer, menuFragment, menuFragment.tag).hide(menuFragment).commit()
        supportFragmentManager.beginTransaction()
            .add(R.id.flContainer, profileFragment, profileFragment.tag).hide(profileFragment)
            .commit()



        binding.bottomNavigationView.setOnItemSelectedListener {
            if (it.itemId == R.id.actionAlarm) {
                supportFragmentManager.beginTransaction()
                    .hide(activeFragment).show(alarmFragment).commit()
                activeFragment = alarmFragment
            } else if (it.itemId == R.id.actionGrass) {
                supportFragmentManager.beginTransaction()
                    .hide(activeFragment).show(grassFragment).commit()
                activeFragment = grassFragment
            } else if (it.itemId == R.id.actionmenu) {
                supportFragmentManager.beginTransaction()
                    .hide(activeFragment).show(menuFragment).commit()
                activeFragment = menuFragment
            } else if (it.itemId == R.id.actionProfile) {
                supportFragmentManager.beginTransaction()
                    .hide(activeFragment).show(profileFragment).commit()
                activeFragment = profileFragment

            } else if (it.itemId == R.id.actionOxirgi_menu) {
                supportFragmentManager.beginTransaction()
                    .hide(activeFragment).show(menuOxirgifragment).commit()
                activeFragment = menuOxirgifragment
            }
            return@setOnItemSelectedListener true
        }
        binding.cardView.setOnClickListener {
            startActivity(Intent(this,ThreeActivity2::class.java))
        }
    }
}