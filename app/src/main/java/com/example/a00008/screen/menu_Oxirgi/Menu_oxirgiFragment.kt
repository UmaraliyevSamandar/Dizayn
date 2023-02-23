package com.example.a00008.screen.menu_Oxirgi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a00008.R
  public class Menu_oxirgiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_oxirgi, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = Menu_oxirgiFragment()
    }
}