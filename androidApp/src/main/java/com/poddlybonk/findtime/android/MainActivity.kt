package com.poddlybonk.findtime.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.res.stringResource
import com.poddlybonk.findtime.android.ui.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView {
                TopAppBar(title = {
                    when (it) {
                        0 -> Text(text = stringResource(R.string.world_clocks))
                        else -> Text(text = stringResource(R.string.findmeeting))
                    }
                })
            }
        }
    }
}
