package com.example.pindo.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.BottomNavBar
import com.example.pindo.ui.BottomNavItem
import com.example.pindo.ui.Header
import com.example.pindo.ui.RunningOutSection
import com.example.pindo.ui.TopOfferSection

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(26.dp)
                .padding(innerPadding)

        ) {
            Header()
            Spacer(modifier = Modifier.height(16.dp))
            RunningOutSection()
            Spacer(modifier = Modifier.height(16.dp))
            TopOfferSection()
            NavHost(navController = navController, startDestination = BottomNavItem.Home.screenRoute) {
                composable(BottomNavItem.Home.screenRoute) { HomeScreen() }
                composable(BottomNavItem.Search.screenRoute) { SearchScreen() }
                composable(BottomNavItem.Notifications.screenRoute) { NotificationsScreen() }
                composable(BottomNavItem.Profile.screenRoute) { ProfileScreen() }
            }
        }
    }
}
