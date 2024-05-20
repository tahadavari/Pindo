package com.example.pindo.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        RunningOutSection()
        Spacer(modifier = Modifier.height(16.dp))
        TopOfferSection()
    }
}
