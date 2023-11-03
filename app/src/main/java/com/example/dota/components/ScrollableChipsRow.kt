package com.example.dota.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.dota.ui.theme.AppTheme

@Composable
fun ScrollableChipsRow(
    items: List<String>, modifier: Modifier = Modifier, contentPadding: PaddingValues
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        items(items) { item ->
            Chip(
                content = item,
                backgroundColor = AppTheme.BgColors.secondary,
            )
        }
    }
}

@Composable
fun Chip(content: String, backgroundColor: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color = backgroundColor)
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Text(
            text = content,
            color = AppTheme.TextColors.chip,
            style = AppTheme.TextStyle.Medium_10_12,
        )
    }
}
