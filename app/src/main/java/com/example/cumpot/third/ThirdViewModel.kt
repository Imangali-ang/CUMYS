package com.example.cumpot.third

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cumpot.data.database.CumysDatabase
import kotlinx.coroutines.launch

class ThirdViewModel(private val type: String, private val database: CumysDatabase): ViewModel() {
    val food = database.dao().getByType(type)


    fun setFavourite() {
        viewModelScope.launch {
            food.value?.let { food ->
                database.dao().setFavourite(food.copy(favourite = !food.favourite))
            }
        }
    }
}