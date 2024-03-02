package com.vetequipament.control.ui.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


val LocalColor = compositionLocalOf { Colors() }

data class Colors(
    val textColor: Color = Color.White,
    val backgroundButtonColor: Color = Color(0xFF1E1E1E),
    val startColor: Color = Color(0xFF33FF00),
    val stopColor: Color = Color(0xFFFF0000),
    val commandColor: Color = Color(0xFF00CED1),
    val confColor: Color = Color(0xFFFFFF00),
    val cleanColor: Color = Color(0xFFFF7200),
    val numberColor: Color = Color.White,
)
