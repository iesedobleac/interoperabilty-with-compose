package com.isaacdelosreyes.navigationwithoutcompose.cooking.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.isaacdelosreyes.navigationwithoutcompose.databinding.FragmentCookingBinding
import com.isaacdelosreyes.navigationwithoutcompose.recipes.presentation.adapter.RecipesPageAdapter

class CookingFragment : Fragment() {

    private lateinit var binding: FragmentCookingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCookingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureTabLayout()
    }

    private fun configureTabLayout() {
        val tabTitles = listOf("Recipes", "Ingredients")

        val adapter = RecipesPageAdapter(requireActivity())
        binding.cookingFragmentViewPager.adapter = adapter

        configureTabTitles(tabTitles)
    }

    private fun configureTabTitles(tabTitles: List<String>) {
        TabLayoutMediator(
            binding.cookingFragmentTabLayout,
            binding.cookingFragmentViewPager
        ) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}