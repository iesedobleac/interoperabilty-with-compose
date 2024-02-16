package com.isaacdelosreyes.navigationwithoutcompose.recipes.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.isaacdelosreyes.navigationwithoutcompose.core.utils.ComposableFragment

class RecipesFragment: ComposableFragment() {

    companion object {

        fun newInstance() = RecipesFragment()
    }

    @Composable
    override fun ComposableContent() {
        RecipesScreen()
    }
}


@Composable
fun RecipesScreen() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "Compose inside fragment",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}