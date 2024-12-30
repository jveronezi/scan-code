package com.example.counterapp.ui.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.counterapp.ui.screens.HomeScreen
import com.example.counterapp.ui.screens.SplashScreen


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home",
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {
//        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
    }
}