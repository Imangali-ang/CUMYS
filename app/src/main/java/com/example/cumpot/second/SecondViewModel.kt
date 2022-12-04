package com.example.cumpot.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cumpot.R
import com.example.cumpot.data.dao.CumuysDao
import com.example.cumpot.data.database.CumysDatabase

class SecondViewModel(database: CumysDatabase) : ViewModel() {
    val foodList = database.dao().getAll()


}