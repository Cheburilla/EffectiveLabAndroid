package com.example.dota.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object AppTheme {

    object BgColors {
        val logo_border: Color
            get() = Color(0xFF1F2430)
        val divider: Color
            get() = Color(0xFF1A1F29)
        val secondary: Color
            get() = Color(0x3D44A9F4)
        val primary: Color
            get() = Color(0xFF050B18)
        val logo_bg: Color
            get() = Color.Black
    }

    object ButtonColors {

        val install_container: Color
            get() = Color(0xFFF4D144)
        val play_icon: Color
            get() = Color.White
    }

    object TextColors {

        val primary_transparent: Color
            get() = Color(0x66FFFFFF)
        val message: Color
            get() = Color(0xFFA8ADB7)
        val primary: Color
            get() = Color.White

        val secondary: Color
            get() = Color(0xB2EEF2FB)

        val chip: Color
            get() = Color(0xFF44A9F4)


        val button: Color
            get() = Color(0xFF050B18)
    }

    object TextStyle {
        val Medium_10_12
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                lineHeight = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
        val Regular_16
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
        val Regular_12
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
        val Regular_12_20
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 20.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
        val Bold_16
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
        val Regular_12_19
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 19.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
        val Bold_20
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
        val Bold_48
            @Composable get() = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                lineHeightStyle = LineHeightStyle(
                    LineHeightStyle.Alignment.Proportional, LineHeightStyle.Trim.None
                ),
            )
    }
}
