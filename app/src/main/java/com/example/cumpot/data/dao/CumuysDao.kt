package com.example.cumpot.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import com.example.cumpot.data.model.FoodDto

@Dao
interface CumuysDao {

    @Query("SELECT * FROM FoodDto")
    fun getAll(): LiveData<List<FoodDto>>

    @Query("SELECT * FROM FoodDto WHERE id =:id")
    fun getById(id: Int): LiveData<FoodDto>

    @Query("SELECT * FROM FoodDto WHERE type = :type")
    fun getByType(type: String): LiveData<FoodDto?>

    @Update(entity = FoodDto::class)
    suspend fun setFavourite(food: FoodDto)
}