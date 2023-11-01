package com.example.dota.ui.dotascreen

import com.example.dota.components.CommentBlock
import com.example.dota.ui.CommentUi
import com.example.dota.components.PrimaryOvalButton
import com.example.dota.components.RatingBlock
import com.example.dota.components.VideoPreviewRow
import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota.R
import com.example.dota.ui.theme.AppTheme

@Preview
@Composable
fun DotaScreen() {

    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            DotaScreenHeader()
        }

        item {
            //com.example.dota.components.ScrollableChipsRow()
            Text(
                text = stringResource(R.string.Dota_2_is),
                style = AppTheme.TextStyle.Regular_12_19,
                color = AppTheme.TextColors.secondary,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 14.dp,
                    bottom = 14.dp,
                )
            )
        }

        item {
            VideoPreviewRow(
                previewResList = listOf(
                    R.drawable.bg_video_preview1,
                    R.drawable.bg_video_preview2,
                ),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        }

        item {
            Text(
                text = stringResource(R.string.review_ratings),
                style = AppTheme.TextStyle.Bold_16,
                color = AppTheme.TextColors.secondary,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 12.dp,
                )
            )
            RatingBlock(
                rating = 4.9f,
                reviewsCount = "70M",
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 16.dp,
                )
            )
        }

        val comments = listOf<CommentUi>()

        itemsIndexed(comments) { index, item ->
            CommentBlock(
                item,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        bottom = 16.dp,
                    )
            )
            if (index < comments.lastIndex) {
                Divider(
                    color = AppTheme.BgColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier.padding(
                        top = 12.dp,
                        bottom = 10.dp,
                    ),
                )
            }
        }

        item {
            PrimaryOvalButton(
                text = stringResource(R.string.install),
                onClick = {
                    Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 20.dp,
                        bottom = 40.dp,
                    )
            )
        }
    }
}
