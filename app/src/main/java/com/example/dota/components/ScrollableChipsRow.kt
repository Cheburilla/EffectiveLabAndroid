package com.example.dota.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.dota.ui.theme.AppTheme

@Composable
fun ScrollableChipsRow(items: List<String>, chipContent: Any, modifier: Modifier = Modifier, contentPadding: PaddingValues) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        items(items) { item ->
            Chip(
                content = { chipContent(item) },
                backgroundColor = AppTheme.BgColors.secondary,
            )
        }
    }
}

fun chipContent(item: String) {

}

@Composable
fun Chip(content: () -> Unit, backgroundColor: Color) {

}
