package com.example.cumpot.third

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.cumpot.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.koin.androidx.viewmodel.ext.android.viewModel

class ThirdFragment : Fragment() {
    private val viewModel by viewModel<ThirdViewModel>()
    private val args: ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
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


        viewModel.getType(args.type.name).observe(viewLifecycleOwner) { food ->
            food?.let { food ->
                star.setImageResource(if (food.favourite) R.drawable.ic_baseline_star_24 else R.drawable.ic_baseline_star_border_24)
                dishInfo.text = food.desc
                title.text = food.title
                dishImage.setImageResource(food.imageResId)


                star.setOnClickListener {
                    viewModel.setFavourite(food)
                }
            }
        }
        Log.d("Beshparmak", R.drawable.besh.toString())
        Log.d("Qazy", R.drawable.qazy.toString())
        Log.d("Sudjuk", R.drawable.sudjuk.toString())
        Log.d("Qarta", R.drawable.qarta.toString())
        Log.d("Sorpa", R.drawable.sorpa.toString())
        Log.d("Quirdaq", R.drawable.quirdaq.toString())
        Log.d("Baursaq", R.drawable.baursaq.toString())
        Log.d("Syrne", R.drawable.syrne3.toString())
    }
}