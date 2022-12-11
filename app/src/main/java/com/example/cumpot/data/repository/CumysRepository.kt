package com.example.cumpot.data.repository

import androidx.lifecycle.LiveData
import com.example.cumpot.data.dao.CumuysDao
import com.example.cumpot.data.model.FoodDto

class CumysRepository(private val dao: CumuysDao) {
    fun getAll(): LiveData<List<FoodDto>> {
        return dao.getAll()
    }

    fun getById(id: Int): LiveData<FoodDto> {
        return dao.getById(id)
    }

    fun getByType(type: String): LiveData<FoodDto?> {
        return dao.getByType(type)
    }

    suspend fun setFavourite(food: FoodDto) {
        dao.setFavourite(food)
    }
}