package com.example.cumpot.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cumpot.R

class SecondViewModel : ViewModel(){
    val list: LiveData<List<Food>> = MutableLiveData(
        listOf(
            Food(R.string.beshbarmaks, FoodType.TYPE_BESH),
            Food(R.string.qazys, FoodType.TYPE_QAZY),
            Food(R.string.shuzik, FoodType.TYPE_SHUZIK),
            Food(R.string.qarta, FoodType.TYPE_QAZY),
            Food(R.string.sorpa, FoodType.TYPE_SORPA),
            Food(R.string.quirdaq, FoodType.TYPE_QUIRDAQ),
            Food(R.string.baursaks, FoodType.TYPE_BAURSAK),
            Food(R.string.syrne, FoodType.TYPE_SYRNE)
        )
    )
}