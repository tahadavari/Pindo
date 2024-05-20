package com.example.pindo.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.pindo.ui.BottomNavBar
import com.example.pindo.ui.Header
import com.example.pindo.ui.RunningOutSection
import com.example.pindo.ui.TopOfferSection

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(bottom = 56.dp) // Adjust padding to make space for BottomNavBar
    ) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        RunningOutSection()
        Spacer(modifier = Modifier.height(16.dp))
        TopOfferSection()
    }
    BottomNavBar(navController = navController)
}
