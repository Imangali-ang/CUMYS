package com.example.cumpot.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.cumpot.second.Food

class FoodDiffUtils : DiffUtil.ItemCallback<Food>(){
    override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean{
        return oldItem.type == newItem.type
    }
}