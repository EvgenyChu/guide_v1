package com.template.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun StartScreen (navController: NavController) {
    Box(modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colors.background))
}