package com.example.pindo.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.SplashScreen
import androidx.compose.material3.Text

@Composable
fun HomeScreen() {
    Text(text = "Home Screen")
}

@Composable
fun SearchScreen() {
    Text(text = "Search Screen")
}

@Composable
fun NotificationsScreen() {
    Text(text = "Notifications Screen")
}

@Composable
fun ProfileScreen() {
    Text(text = "Profile Screen")
}

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
        composable("search") {
            SearchScreen() // Define SearchScreen composable
        }
        composable("notifications") {
            NotificationsScreen() // Define NotificationsScreen composable
        }
        composable("profile") {
            ProfileScreen() // Define ProfileScreen composable
        }
    }

}




