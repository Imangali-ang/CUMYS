package com.example.cumpot.second

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cumpot.adapter.FoodAdapter
import com.example.cumpot.data.database.CumysDatabase
import com.example.cumpot.databinding.FragmentSecondBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModel<SecondViewModel>()
    private lateinit var adapter: FoodAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FoodAdapter { food ->
            navigateToDish(food.type)
        }
        binding.recyclerList.adapter = adapter
        binding.lifecycleOwner = this
        viewModel.foodList.observe(viewLifecycleOwner) { foodDto->
            adapter.submitList(foodDto.map { Food(it) })
        }
    }

    private fun navigateToDish(type: FoodType) {
        val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(type)
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}