package com.example.scanner_app.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.scanner_app.R

// Set of Material typography styles to start with
val RobotoSlab = FontFamily(
    listOf(
        Font(R.font.roboto_slab_semibold, FontWeight.Bold),
        Font(R.font.roboto_slab_medium , FontWeight.Medium),
        Font(R.font.roboto_slab_light , FontWeight.Light),
        Font(R.font.roboto_slab_extralight , FontWeight.ExtraLight)
    )
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = RobotoSlab,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = RobotoSlab,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 24.sp
    ),
    h2 = TextStyle(
        fontFamily = RobotoSlab,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    h3 = TextStyle(
        fontFamily = RobotoSlab,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    ),
    h4 = TextStyle(
        fontFamily = RobotoSlab,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        color = TextWhite
    ),
    h5 = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.ExtraBold,
        color= AquaBlue,
        fontSize = 20.sp
),
            h6 = TextStyle(
            fontFamily = FontFamily.SansSerif,
    fontWeight = FontWeight.SemiBold,
    color = TextWhite,
    fontSize = 14.sp
),
            subtitle1 = TextStyle(
        fontFamily = RobotoSlab,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
                color = Color.Gray
    ),
    subtitle2 = TextStyle(
        fontFamily = RobotoSlab,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        color = Color.Black
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)