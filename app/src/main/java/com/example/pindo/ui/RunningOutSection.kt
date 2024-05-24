package com.example.pindo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun RunningOutSection(navController: NavHostController) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Running Out 🔥",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "See All",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(listOf("Product 01", "Product 02", "Product 03")) { productName ->
                ProductCard(productName, navController)
            }
        }
    }
}
