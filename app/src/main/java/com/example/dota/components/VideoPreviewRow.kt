package com.example.dota.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota.R
import com.example.dota.ui.theme.AppTheme

@Composable
fun VideoPreviewRow(previewResList: List<Int>, contentPadding: PaddingValues) {
    LazyRow(
        contentPadding = contentPadding, horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        items(previewResList) { preview ->
            Box(modifier = Modifier.size(240.dp, 128.dp)) {
                Image(
                    painter = painterResource(preview),
                    contentDescription = "Video",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(12.dp))
                )
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .blur(1.5.dp)
                        .size(48.dp)
                        .align(Alignment.Center)
                        .background(
                            color = Color(0x3DFFFFFF)
                        )
                ) {
                    Icon(
                        imageVector = Icons.Rounded.PlayArrow,
                        contentDescription = "play",
                        modifier = Modifier.align(Alignment.Center),
                        tint = AppTheme.ButtonColors.play_icon,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun VideoPreviewRowPreview() {
    VideoPreviewRow(
        previewResList = listOf(
            R.drawable.bg_video_preview1,
            R.drawable.bg_video_preview2,
        ), contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
    )
}
