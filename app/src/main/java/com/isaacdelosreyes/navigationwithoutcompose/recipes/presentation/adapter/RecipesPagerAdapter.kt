package com.isaacdelosreyes.navigationwithoutcompose.recipes.presentation.adapter

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.isaacdelosreyes.navigationwithoutcompose.ingredients.presentation.IngredientsFragment
import com.isaacdelosreyes.navigationwithoutcompose.recipes.presentation.RecipesFragment

class RecipesPageAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int) = when (position) {
        0 -> RecipesFragment.newInstance()
        else -> IngredientsFragment.newInstance()
    }
}