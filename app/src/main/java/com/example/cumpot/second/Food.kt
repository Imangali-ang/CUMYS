package com.example.cumpot.second

import com.example.cumpot.data.model.FoodDto
import java.io.Serializable

data class Food(val name: String, val type: FoodType) {
    constructor(dto: FoodDto) : this(dto.title, FoodType.valueOf(dto.type))
}



enum class FoodType: Serializable {
    TYPE_BESH, TYPE_QAZY, TYPE_SHUZIK, TYPE_KARTA, TYPE_SORPA, TYPE_QUIRDAQ, TYPE_BAURSAK, TYPE_SYRNE
}