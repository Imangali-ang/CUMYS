package com.example.cumpot

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class SecondFragment : Fragment() {
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val btn = view.findViewById<Button>(R.id.beshbarmak)
        val btn2 = view.findViewById<Button>(R.id.qazy)
        val btn3 = view.findViewById<Button>(R.id.shuzik)
        val btn4 = view.findViewById<Button>(R.id.karta)
        btn.setOnClickListener{
            val thirdFragment = ThirdFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.menu,thirdFragment)
            transaction.commit()
        }
        btn2.setOnClickListener{
            val fourthFragment = FourthFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.menu,fourthFragment)
            transaction.commit()
        }
        btn3.setOnClickListener{
            val fifthFragment = FifthFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.menu,fifthFragment)
            transaction.commit()
        }
        btn4.setOnClickListener{
            val sixthFragment = SixthFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.menu,sixthFragment)
            transaction.commit()
        }

        return view
    }
}