package com.example.pindo.ui.screens

import HomeScreen
import ProductDetailScreen
import SearchScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.SplashScreen


@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen {
                navController.navigate("main") {
                    popUpTo("splash") { inclusive = true }
                }
            }
        }
        composable("main") {
            MainScreen()
        }
        composable("home") {
            HomeScreen(navController)
        }
        composable("productDetail") {
            ProductDetailScreen(navController)
        }
        composable("search") {
            SearchScreen(navController)
        }
    }

}




