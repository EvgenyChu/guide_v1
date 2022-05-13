package com.template.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.template.R

val segoeUIBold = FontFamily(
    Font(R.font.segoe_ui_bold)
)

val segoeUIRegular = FontFamily(
    Font(R.font.segoe_ui_regular)
)

fun MyTypography(onPrimary: Color, onBackground: Color, onSecondary: Color) = Typography(
    h1 = TextStyle(
        fontFamily = segoeUIBold,

        fontSize = 96.sp
    ),
    h2 = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 60.sp
    ),
    h3 = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 48.sp
    ),
    h4 = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 21.sp,
        color = onBackground
    ),
    h5 = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 17.sp,
        color = onPrimary
    ),
    h6 = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 21.sp,
        color = onPrimary
    ),
    subtitle1 = TextStyle(
        fontFamily = segoeUIRegular,
        fontSize = 17.sp,
        color = onBackground
    ),
    subtitle2 = TextStyle(
        fontFamily = segoeUIRegular,
        fontSize = 17.sp,
        color = onSecondary
    ),
    body1 = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 14.sp,
        color = onPrimary
    ),
    body2 = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 14.sp,
        color = onBackground
    ),
    button = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = segoeUIBold,
        fontSize = 14.sp,
        color = onBackground
    ),
    overline = TextStyle(
        fontFamily = segoeUIRegular,
        fontSize = 17.sp
    )
)