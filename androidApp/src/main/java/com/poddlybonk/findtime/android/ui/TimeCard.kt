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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.poddlybonk.findtime.android.theme.AppTheme

@Composable
fun TimeCard(timezone: String, hours: Double, time: String, date: String) {
    Box(
        modifier = Modifier
//            .fillMaxSize()
            .height(120.dp)
            .background(Color.White)
            .padding(8.dp)
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.Gray),
            elevation = 4.dp,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box(modifier = Modifier
                .background(color = Color.White)
                .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column(horizontalAlignment = Alignment.Start) {
                        Text(
                            timezone, style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Row {
                           Text(
                               hours.toString(),
                               style = TextStyle(
                                   color = Color.Black,
                                   fontWeight = FontWeight.Bold,
                                   fontSize = 14.sp
                               )
                           )
                            Text(
                                " hours from local",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 14.sp
                                )
                            )
                        }
                    }
                    Spacer(modifier = Modifier.weight(1.0f))
                    Column(horizontalAlignment = Alignment.End) {
                        Text(
                            time,
                            style = TextStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 24.sp
                            )
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Text(
                            date,
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp
                            )
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun TimeCardPreview() {
    AppTheme {
        TimeCard(timezone = "Australia/Perth", hours = 4.0, time = "5:00 am", date = "Friday, 29 May")
    }
}

