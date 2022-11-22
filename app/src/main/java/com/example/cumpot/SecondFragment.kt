package com.example.cumpot

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController

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
        val btn5 = view.findViewById<Button>(R.id.sorpa)
        val btn6 = view.findViewById<Button>(R.id.quirdaq)
        val btn7 = view.findViewById<Button>(R.id.baursak)
        val btn8 = view.findViewById<Button>(R.id.syrne)

        btn.setOnClickListener {
            navigateToDish(type = TYPE_BESH)
        }
        btn2.setOnClickListener {
            navigateToDish(type = "syrne")
        }
        btn3.setOnClickListener {
            navigateToDish(type = "syrne")
        }
        btn4.setOnClickListener {
            navigateToDish(type = "syrne")
        }
        btn5.setOnClickListener {
            navigateToDish(type = "syrne")
        }
        btn6.setOnClickListener {
            navigateToDish(type = "syrne")
        }
        btn7.setOnClickListener {
            navigateToDish(type = "syrne")
        }
        btn8.setOnClickListener {
            navigateToDish(type = "syrne")
        }
        return view
    }

    private fun navigateToDish(type: String) {
        val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(type)
        findNavController().navigate(action)
    }
}