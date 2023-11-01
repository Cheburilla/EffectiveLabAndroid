package com.example.dota.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dota.ui.CommentUi
import com.example.dota.ui.theme.AppTheme

@Composable
fun CommentBlock(
    commentUi: CommentUi,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Row {
            Box(modifier = Modifier
                .clip(CircleShape)
                .size(36.dp)
            ) {
                Image(
                    painter = painterResource(commentUi.user.avatar),
                    contentDescription = "Avatar",
                    contentScale = ContentScale.Crop,
                )
            }
            Column(){
                Text(
                    text = "\"${commentUi.message}\"",
                    style = AppTheme.TextStyle.Regular_12_20,
                    color = AppTheme.TextColors.message,
                    modifier = Modifier.padding(
                        top = 16.dp,
                        bottom = 12.dp
                    )
                )
            }
        }
    }
}