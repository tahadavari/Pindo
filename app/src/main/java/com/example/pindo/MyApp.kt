package com.example.pindo.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.theme.PindoTheme

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
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    PindoTheme {
        MyApp()
    }
}
