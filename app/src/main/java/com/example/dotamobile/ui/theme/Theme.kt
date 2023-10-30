package com.example.dotamobile.ui.theme

import FontFamily
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object AppTheme {

    object BgColors {

        val primary: Color
            get() {
                TODO()
            }
    }

    object ButtonColors {

    }

    object TextColors {

        val secondary: Color
            get() {
                TODO()
            }
    }

    object TextStyle {
        val Regular_12_19: TextStyle
            get() {
                TODO()
            }
        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    ),
                )
    }
}

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(),
             content: @Composable () -> Unit
) {

}
