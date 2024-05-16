package com.example.dota.ui.dotascreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota.R
import com.example.dota.components.RatingBar
import com.example.dota.ui.theme.AppTheme

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {

    HeaderBackground(
        painter = painterResource(R.drawable.bg_header), modifier = modifier
    ) {
        Box(
            modifier = Modifier.padding(start = 24.dp, top = 274.dp)
        ) {
            Row {
                DotaLogo(modifier = Modifier)
                Column(modifier = Modifier.padding(start = 12.dp, top = 34.dp)) {
                    Text(
                        text = stringResource(R.string.app_name),
                        style = AppTheme.TextStyle.Bold_20,
                        color = AppTheme.TextColors.primary,
                    )
                    Row(modifier = Modifier.padding(top = 6.dp)) {
                        RatingBar(
                            currentRating = 5.0f,
                            modifier = Modifier
                                .height(14.dp)
                                .width(76.dp),
                        )
                        Text(
                            text = "70M",
                            style = AppTheme.TextStyle.Regular_12,
                            color = AppTheme.TextColors.primary_transparent,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = "Header background",
            modifier = Modifier
                .fillMaxWidth()
                .height(294.dp),
            contentScale = ContentScale.Crop,
        )
        content()
    }
}

@Composable
private fun DotaLogo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(88.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = AppTheme.BgColors.logo_border)
    ) {
        Box(
            modifier = modifier
                .size(84.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(color = AppTheme.BgColors.logo_bg)
                .align(Alignment.Center)
        ) {
            Box(modifier = modifier.align(Alignment.Center)) {
                Image(
                    painter = painterResource(R.drawable.dota_logo),
                    contentDescription = "Dota logo",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(54.dp)
                )
            }
        }
    }

}

@Preview
@Composable
fun DotaScreenHeaderPreview() {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        DotaScreenHeader()
    }
}

@Preview
@Composable
fun DotaLogoPreview() {
    DotaLogo()
}
