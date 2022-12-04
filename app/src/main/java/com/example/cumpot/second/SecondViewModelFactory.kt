package com.example.cumpot.second

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cumpot.data.database.CumysDatabase

class SecondViewModelFactory(private val database: CumysDatabase): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SecondViewModel::class.java)) {
            return SecondViewModel(database) as T
        }
        throw IllegalArgumentException("Unknown argument")
    }
}