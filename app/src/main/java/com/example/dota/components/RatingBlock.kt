package com.example.dota.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dota.ui.theme.AppTheme

@Composable
fun RatingBlock(
    rating: Float,
    reviewsCount: String,
    modifier: Modifier,
) {
    Row(modifier = modifier) {
        Text(
            text = rating.toString(),
            style = AppTheme.TextStyle.Bold_48,
            color = AppTheme.TextColors.primary,
        )
        Column(
            modifier = Modifier.padding(
                    top = 17.dp,
                    bottom = 7.dp,
                    start = 16.dp,
                )
        ) {
            RatingBar(
                currentRating = rating,
                modifier = Modifier
                    .height(12.dp)
                    .width(76.dp),
            )
            Text(
                text = "$reviewsCount Reviews",
                style = AppTheme.TextStyle.Regular_12,
                color = AppTheme.TextColors.message,
            )
        }
    }
}
