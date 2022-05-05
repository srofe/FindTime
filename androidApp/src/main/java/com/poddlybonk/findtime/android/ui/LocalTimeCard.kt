package com.poddlybonk.findtime.android.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poddlybonk.findtime.android.theme.AppTheme
import com.poddlybonk.findtime.android.theme.primaryColor
import com.poddlybonk.findtime.android.theme.primaryDarkColor
import com.poddlybonk.findtime.android.theme.typography

@Composable
fun LocalTimeCard(city: String, time: String, date: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.White)
            .padding(8.dp)
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.Black),
            elevation = 4.dp,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                primaryColor,
                                primaryDarkColor,
                            )
                        )
                    )
                    .padding(8.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(horizontalAlignment = Alignment.Start) {
                        Spacer(modifier = Modifier.weight(1.0f))
                        Text("Your Location", style = typography.h4)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(city, style = typography.h2)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                    Spacer(modifier = Modifier.weight(1.0f))
                    Column(horizontalAlignment = Alignment.End) {
                        Spacer(modifier = Modifier.weight(1.0f))
                        Text(time, style = typography.h1)
                        Spacer(modifier = Modifier.weight(1.0f))
                        Text(date, style = typography.h3)
                        Spacer(modifier = Modifier.weight(1.0f))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun LocalTimeCardPreview() {
    AppTheme {
        LocalTimeCard(city = "Brisbane", time = "9:00 am", date = "Friday, 29 May")
    }
}
