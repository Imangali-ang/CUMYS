package com.example.cumpot.third

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.cumpot.R
import com.example.cumpot.data.database.CumysDatabase
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ThirdFragment : Fragment() {
    private lateinit var viewModel: ThirdViewModel
    private val args: ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val context = requireActivity().applicationContext
        val database = CumysDatabase.getInstance(context)
        val factory = ThirdViewModelFactory(args.type.name, database)
        viewModel = ViewModelProvider(this, factory)[ThirdViewModel::class.java]

        return view
    }

    
    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<FloatingActionButton>(R.id.back)
        btn.setOnClickListener {
            findNavController().navigateUp()
        }
        val star = view.findViewById<ImageView>(R.id.star)
        val dishImage = view.findViewById<ImageView>(R.id.besh_img)
        val dishInfo = view.findViewById<TextView>(R.id.info_besh)
        val title = view.findViewById<TextView>(R.id.title)

        star.setOnClickListener {
            viewModel.setFavourite()
        }

        viewModel.food.observe(viewLifecycleOwner) { food ->
            food?.let { food ->
                star.setImageResource(if (food.favourite) R.drawable.ic_baseline_star_24 else R.drawable.ic_baseline_star_border_24)
                dishInfo.text = food.desc
                title.text = food.title
                dishImage.setImageResource(food.imageResId)
            }
        }
    }
}
