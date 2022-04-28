package com.poddlybonk.findtime.android.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poddlybonk.findtime.android.theme.AppTheme

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
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // TODO: Add body
        }
    }
}

@Preview
@Composable
fun LocalTimeCardPreview() {
    AppTheme {
        LocalTimeCard(city = "Brisbane", time = "9:00 am", date = "3 Jan 2022")
    }
}
