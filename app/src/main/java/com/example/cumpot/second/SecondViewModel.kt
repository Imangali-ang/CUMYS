package com.example.cumpot.second

import androidx.lifecycle.ViewModel
import com.example.cumpot.data.repository.CumysRepository

class SecondViewModel(repository: CumysRepository) : ViewModel() {
    val foodList = repository.getAll()
}