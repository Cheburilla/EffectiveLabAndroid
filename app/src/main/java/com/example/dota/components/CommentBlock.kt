package com.example.dota.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota.R
import com.example.dota.ui.CommentUi
import com.example.dota.ui.User
import com.example.dota.ui.theme.AppTheme

val comments = listOf(
    CommentUi(
        message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        user = User(
            avatar = R.drawable.avatar_1,
            name = "Auguste Conte",
        ),
        date = "February 14, 2019",
    ), CommentUi(
        message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        user = User(
            avatar = R.drawable.avatar_2,
            name = "Jang Marcelino",
        ),
        date = "February 14, 2019",
    )
)

@Composable
fun CommentBlock(
    commentUi: CommentUi,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Row {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ) {
                Image(
                    painter = painterResource(commentUi.user.avatar),
                    contentDescription = "Avatar",
                    contentScale = ContentScale.Crop,
                )
            }
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = commentUi.user.name,
                    style = AppTheme.TextStyle.Regular_16,
                    color = AppTheme.TextColors.primary,
                )
                Text(
                    text = commentUi.date,
                    style = AppTheme.TextStyle.Regular_12_19,
                    color = AppTheme.TextColors.primary_transparent,
                )
            }
        }
        Text(
            text = "\"${commentUi.message}\"",
            style = AppTheme.TextStyle.Regular_12_20,
            color = AppTheme.TextColors.message,
            modifier = Modifier.padding(
                top = 16.dp,
            )
        )
    }
}

@Preview
@Composable
fun CommentBlockPreview(
) {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        CommentBlock(commentUi = comments[0])
    }
}
