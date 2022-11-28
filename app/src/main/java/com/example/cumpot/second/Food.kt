package com.example.cumpot.second

import java.io.Serializable

data class Food(val name: Int, val type: FoodType)
enum class FoodType: Serializable {
    TYPE_BESH, TYPE_QAZY, TYPE_SHUZIK, TYPE_KARTA, TYPE_SORPA, TYPE_QUIRDAQ, TYPE_BAURSAK, TYPE_SYRNE
}