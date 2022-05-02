package com.poddlybonk.findtime.android.ui

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.snapshots.SnapshotStateMap
import com.poddlybonk.findtime.TimeZoneHelper
import com.poddlybonk.findtime.TimeZoneHelperImpl

@Composable
fun FindMeetingScreen(
    timezoneStrings: List<String>
) {
    val lisState = rememberLazyListState()
    val startTime = remember {
        mutableStateOf(8)
    }
    val endTime = remember {
        mutableStateOf(17)
    }
    val selectedTimeZones = remember {
        val selected = SnapshotStateMap<Int, Boolean>()
        for (i in 0 .. timezoneStrings.size - 1) selected[i] = true
        selected
    }
    val timeZoneHelper: TimeZoneHelper = TimeZoneHelperImpl()
    val showMeetingDialog = remember { mutableStateOf(false) }
    val meetingHours = remember { SnapshotStateList<Int>() }

    if (showMeetingDialog.value) {
        MeetingDialog(
            hours = meetingHours,
            onDismiss = {
                showMeetingDialog.value = false
            }
        )
    }
    // TODO: Add content
}

// TODO: Add getSelectedTimeZones
