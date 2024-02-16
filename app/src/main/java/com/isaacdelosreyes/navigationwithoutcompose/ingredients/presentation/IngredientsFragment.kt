package com.isaacdelosreyes.navigationwithoutcompose.ingredients.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.isaacdelosreyes.navigationwithoutcompose.databinding.FragmentIngredientsBinding

class IngredientsFragment: Fragment() {

    private lateinit var binding: FragmentIngredientsBinding

    companion object {

        fun newInstance() = IngredientsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIngredientsBinding.inflate(inflater)
        return binding.root
    }
}