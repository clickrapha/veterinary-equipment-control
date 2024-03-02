package com.vetequipament.control

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val LocalDim = compositionLocalOf { Dimensions() }

data class Dimensions(
    val buttonSize: Dp = 95.dp,
    val buttonBorderWidth: Dp = 5.dp,
    val buttonSpaceWidth: Dp = 14.dp,
    val textButtonFontSize: TextUnit = 24.sp,
    val textButtonLetterSpacing: TextUnit = 1.5.sp,

    )