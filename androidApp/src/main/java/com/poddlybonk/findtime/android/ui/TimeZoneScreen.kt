package com.poddlybonk.findtime.android.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import com.poddlybonk.findtime.TimeZoneHelper
import com.poddlybonk.findtime.TimeZoneHelperImpl

const val timeMillis = 1000 * 60L

@Composable
fun TimeZoneScreen(currentTimeZoneStrings: SnapshotStateList<String>) {
    val timezoneHelper: TimeZoneHelper = TimeZoneHelperImpl()
    val listState = rememberLazyListState()
    Column(modifier = Modifier.fillMaxWidth()) {
        // TODO: Add content
    }
}