import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
        Image(painter = painter, contentDescription = null)
    }
}

@Composable
private fun DotaLogo() {

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