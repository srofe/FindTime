package com.poddlybonk.findtime.android.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TimeCard(timezone: String, hours: Double, time: String, date: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
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
            // TODO: Add content
        }
    }
}
