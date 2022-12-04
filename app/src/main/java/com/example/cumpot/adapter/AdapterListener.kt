package com.example.cumpot.adapter

import com.example.cumpot.second.Food

interface AdapterListener {
    fun onItemClick(food: Food)
}