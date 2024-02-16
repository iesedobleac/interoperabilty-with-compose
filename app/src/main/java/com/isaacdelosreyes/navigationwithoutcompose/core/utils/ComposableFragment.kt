package com.isaacdelosreyes.navigationwithoutcompose.core.utils

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

abstract class ComposableFragment : Fragment() {

    @Composable
    abstract fun ComposableContent()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = ComposeView(
        requireContext()
    ).apply {
        setContent {
            ComposableContent()
        }
    }
}