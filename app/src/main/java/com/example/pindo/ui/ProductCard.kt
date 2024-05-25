package com.example.pindo.ui

import android.os.CountDownTimer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.example.pindo.R
import java.util.concurrent.TimeUnit

@Composable
fun ProductCard(productName: String, navController: NavHostController) {
    var timeLeftFormatted by remember { mutableStateOf("03h : 23m : 15s") }

    val initialTime =
        3 * 60 * 60 * 1000L + 23 * 60 * 1000 + 15 * 1000 // 3 hours, 23 minutes, 15 seconds in milliseconds
    val countDownTimer = object : CountDownTimer(initialTime, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            val hours = TimeUnit.MILLISECONDS.toHours(millisUntilFinished)
            val minutes = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) % 60
            val seconds = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % 60
            timeLeftFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds)
        }

        override fun onFinish() {
            timeLeftFormatted = "00:00:00"
        }
    }
    LaunchedEffect(key1 = initialTime) {
        countDownTimer.start()
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(364.dp)
            .clickable { navController.navigate("productDetail") },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF7F7F7))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.placeholder_image),
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = productName,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()

            ) {
                Column {
                    Text(
                        text = "Price",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "37\$",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 4.dp)
                    )
                }
                Text(
                    text = timeLeftFormatted,
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}