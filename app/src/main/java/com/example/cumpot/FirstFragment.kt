package com.example.cumpot

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val btn = view.findViewById<Button>(R.id.next)
        val imageView3 = view.findViewById<ImageView>(R.id.imageView3)
        btn.setOnClickListener{
            findNavController().navigate(R.id.secondFragment)
        }
        imageView3.setOnClickListener {
            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf<String>("200107112@stu.sdu.edu.kz"))
            email.putExtra(Intent.EXTRA_SUBJECT, "Hello")
            email.putExtra(Intent.EXTRA_TEXT, "CUMPOT")
            email.type = "message/rfc822"

            (activity as? MainActivity)?.startActivity(Intent.createChooser(email, "Choose an Email client :"))
        }
        return view
    }
}