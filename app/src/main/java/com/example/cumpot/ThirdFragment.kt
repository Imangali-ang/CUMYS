package com.example.cumpot

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.cumpot.second.FoodType

class ThirdFragment : Fragment() {

    private val args: ThirdFragmentArgs by navArgs()

    @SuppressLint("UseRequireInsteadOfGet", "MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val btn = view.findViewById<Button>(R.id.back)
        val dishImage = view.findViewById<ImageView>(R.id.besh_img)
        val dishInfo = view.findViewById<TextView>(R.id.info_besh)

        btn.setOnClickListener{
            findNavController().navigateUp()
        }
        when (args.type) {
            FoodType.TYPE_BESH -> {
                dishImage.setImageResource(R.drawable.besh)
                dishInfo.setText(R.string.besh_info)
            }
            FoodType.TYPE_QAZY -> {
                dishImage.setImageResource(R.drawable.qazy)
                dishInfo.setText(R.string.qazy_info)
            }
            FoodType.TYPE_SHUZIK -> {
                dishImage.setImageResource(R.drawable.sudjuk)
                dishInfo.setText(R.string.shuzik_info)
            }
            FoodType.TYPE_KARTA -> {
                dishImage.setImageResource(R.drawable.qarta)
                dishInfo.setText(R.string.qarta_info)
            }
            FoodType.TYPE_SORPA -> {
                dishImage.setImageResource(R.drawable.sorpa)
                dishInfo.setText(R.string.sorpa_info)
            }
            FoodType.TYPE_QUIRDAQ -> {
                dishImage.setImageResource(R.drawable.quirdaq)
                dishInfo.setText(R.string.quirdaq_info)
            }
            FoodType.TYPE_BAURSAK -> {
                dishImage.setImageResource(R.drawable.baursaq)
                dishInfo.setText(R.string.baursaq_info)
            }
            FoodType.TYPE_SYRNE -> {
                dishImage.setImageResource(R.drawable.syrne)
                dishInfo.setText(R.string.syrne_info)
            }
        }
        return view
    }
}