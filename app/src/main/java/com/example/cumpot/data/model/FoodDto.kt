package com.example.cumpot.data.model

import androidx.annotation.IdRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FoodDto(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "image_res_id")
    @IdRes val imageResId: Int,
    val title: String,
    val desc: String,
    val time: String,
    val type: String,
    val favourite: Boolean
)