package com.example.dota.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.dota.R

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    maxRating: Int = 5,
    currentRating: Float,
    starsColor: Color = Color(0xFFF4D144),
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        val currentRatingInt = currentRating / 1
        for (i in 1..maxRating) {
            Icon(
                imageVector = if (i <= currentRatingInt) Icons.Filled.Star
                else ImageVector.vectorResource(R.drawable.star_half),
                contentDescription = null,
                tint = if (i <= currentRatingInt) starsColor else Color.Unspecified,
            )
        }
    }
}
