package com.example.pindo.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.SplashScreen
import androidx.compose.material3.Text


@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen {
                navController.navigate("home") {
                    popUpTo("splash") { inclusive = true }
                }
            }
        }
        composable("home") {
            MainScreen()
        }
    }

}




