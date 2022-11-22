package com.example.cumpot

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class ThirdFragment : Fragment() {

    private val args: ThirdFragmentArgs by navArgs()

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val btn = view.findViewById<Button>(R.id.back)
        val dishImage = view.findViewById<ImageView>(R.id.imageView4)
        btn.setOnClickListener{
            findNavController().navigateUp()
        }
        when (args.dish) {
            TYPE_BESH -> {
                dishImage.setImageResource(R.drawable.besh)
            }
            "syrne" -> {
                dishImage.setImageResource(R.drawable.syrne)
            }
        }
        args.dish

        return view
    }
}

const val TYPE_BESH= "besh"