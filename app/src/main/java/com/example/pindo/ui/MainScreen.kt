package com.example.pindo.ui.screens

import HomeScreen
import ProductDetailScreen
import SearchScreen
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.BottomNavBar
import com.example.pindo.ui.BottomNavItem

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = BottomNavItem.Home.screenRoute, modifier = Modifier.padding(innerPadding)) {
            composable(BottomNavItem.Home.screenRoute) { HomeScreen(navController) }
            composable(BottomNavItem.Search.screenRoute) { SearchScreen(navController) }
            composable("productDetail") { ProductDetailScreen(navController) }
        }
    }
}
