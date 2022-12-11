package com.example.cumpot.third

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cumpot.data.database.CumysDatabase
import com.example.cumpot.data.model.FoodDto
import com.example.cumpot.data.repository.CumysRepository
import kotlinx.coroutines.launch

class ThirdViewModel(private val repository: CumysRepository): ViewModel() {
    fun setFavourite(food: FoodDto) {
        viewModelScope.launch {
            repository.setFavourite(food.copy(favourite = !food.favourite))
        }
    }

    fun getType(type: String): LiveData<FoodDto?> {
        return repository.getByType(type)
    }
}