package com.example.dota.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dota.ui.dotascreen.DotaScreen
import com.example.dota.ui.theme.AppTheme

@Composable
fun MainScreen() {
    MaterialTheme {
        Surface(
            color = AppTheme.BgColors.primary,
            modifier = Modifier.fillMaxSize(),
        )
        {
            DotaScreen()
        }
    }
}