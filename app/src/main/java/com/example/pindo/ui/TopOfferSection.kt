package com.example.pindo.ui

import androidx.compose.foundation.layout.*
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
    Column {
        TopOfferItem(rank = 1, productName = "Product 02", price = "6$", originalPrice = "20$", discount = "+71.9%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
        TopOfferItem(rank = 2, productName = "Product 03", price = "24$", originalPrice = "60$", discount = "+64.1%")
    }
}
