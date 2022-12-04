package com.example.cumpot.third

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cumpot.data.database.CumysDatabase

class ThirdViewModelFactory(private val type: String, private val database: CumysDatabase): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ThirdViewModel::class.java)) {
            return ThirdViewModel(type, database) as T
        }
        throw IllegalArgumentException("Unknown viewModel")
    }
}