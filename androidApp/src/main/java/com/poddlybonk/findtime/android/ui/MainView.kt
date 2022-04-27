package com.poddlybonk.findtime.android.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.poddlybonk.findtime.android.theme.AppTheme

sealed class Screen(val title: String) {
    object TimeZoneScreen : Screen("TimeZone")
    object FindTimeScreen : Screen("Find Time")
}

data class BottomNavigationItems (
    val route: String,
    val icon: ImageVector,
    val iconContentDescription: String
)

val bottomNavigationItems = listOf(
    BottomNavigationItems(
        Screen.TimeZoneScreen.title,
        Icons.Filled.Language,
        "Timezones"
    ),
    BottomNavigationItems(
        Screen.FindTimeScreen.title,
        Icons.Filled.Place,
        "Find Time"
    )
)

@Composable
fun MainView(actionBarFun: topBarFun = { emptyComposable() }) {
    val showAddDialog = remember { mutableStateOf(false) }
    val currentTimezoneStrings = remember { SnapshotStateList<String>() }
    val selectedIndex = remember { mutableStateOf(0) }
    AppTheme {}
}
