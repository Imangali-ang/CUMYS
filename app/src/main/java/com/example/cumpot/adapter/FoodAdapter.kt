package com.example.cumpot.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cumpot.databinding.ItemListBinding
import com.example.cumpot.second.Food

@SuppressLint("ResourceType")
class FoodAdapter(private val adapter: (Food) -> Unit) :
    ListAdapter<Food, FoodAdapter.FoodViewHolder>(FoodDiffUtils()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder.getViewHolder(parent)
    }
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.configure(adapter, getItem(position))
    }

    class FoodViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun configure(adapter: (Food) -> Unit, food: Food) {
            binding.button.setText(food.name)
            binding.button.setOnClickListener {
                adapter(food)
            }
        }

        companion object {
            fun getViewHolder(parent: ViewGroup): FoodViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ItemListBinding.inflate(inflater, parent, false)
                return FoodViewHolder(binding)
            }
        }

    }
}