import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotamobile.R
import com.example.dotamobile.ui.theme.AppTheme

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {

    HeaderBackground(
        painter = painterResource(R.drawable.bg_header),
        modifier = modifier
    ) {

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
            modifier = modifier
                .width(375.dp)
                .height(294.dp),
            contentScale = ContentScale.FillWidth
        )
        Row(
            modifier = modifier
                .padding(start = 24.dp, top = 274.dp)
                .height(95.dp)
                .width(212.dp)
        ) {
            Box(
                modifier = modifier
                    .size(88.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = Color.DarkGray)
            ) {
                Box(
                    modifier = modifier
                        .size(84.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = Color.Black)
                        .align(Alignment.Center)
                ) {
                    Box(modifier = modifier.align(Alignment.Center)) {
                        DotaLogo()
                    }
                }
            }
            Column(modifier = modifier.padding(start = 12.dp, top = 34.dp)) {
                Text(
                    text = stringResource(R.string.app_name),
                    style = AppTheme.TextStyle.Bold_20,
                    color = AppTheme.TextColors.primary,
                )

            }
        }
    }
}

@Composable
private fun DotaLogo() {
    Image(
        painter = painterResource(R.drawable.dota_logo),
        contentDescription = "Dota logo",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.size(54.dp)
    )
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