
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotamobile.R

@Composable
fun VideoPreviewRow(previewResList: List<Int>, contentPadding: PaddingValues) {
    LazyRow(
        contentPadding = contentPadding,
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ){
        items(previewResList) {preview ->
            Box(modifier = Modifier.size(240.dp, 135.dp)
            )
            {
                Image(
                    painter = painterResource(preview),
                    contentDescription = "Video",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Preview
@Composable
fun VideoPreviewRowPreview(){
    VideoPreviewRow(
        previewResList = listOf(
            R.drawable.bg_video_preview1,
            R.drawable.bg_video_preview2,
        ),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
    )
}
