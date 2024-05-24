package com.example.pindo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color

@Composable
fun TopOfferSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Top Offer",
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
    LazyColumn {
        items(
            listOf(
                Pair(1, "Product 02"),
                Pair(2, "Product 03"),
                Pair(3, "Product 04"),
                Pair(4, "Product 05"),
                Pair(5, "Product 06"),
                Pair(6, "Product 07"),
                Pair(7, "Product 08"),
                Pair(8, "Product 09"),
                Pair(9, "Product 10"),
                Pair(10, "Product 11"),
                Pair(11, "Product 12")
            )
        ) { item ->
            TopOfferItem(
                rank = item.first,
                productName = item.second,
                price = "24$",
                originalPrice = "60$",
                discount = "+64.1%"
            )
        }
    }
}
