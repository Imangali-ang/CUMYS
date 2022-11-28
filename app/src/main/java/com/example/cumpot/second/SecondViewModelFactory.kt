package com.example.cumpot.second

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SecondViewModelFactory: ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SecondViewModel::class.java)) {
            return SecondViewModel() as T
        }
        throw IllegalArgumentException("Unknown argument")
    }
}