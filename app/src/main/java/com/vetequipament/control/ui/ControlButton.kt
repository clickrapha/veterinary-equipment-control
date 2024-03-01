package com.vetequipament.control.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CircleWithBorder(
    borderColor: Color,
    backgroundColor: Color,
    borderWidth: Dp,
    size: Dp
) {
    Box(
        modifier = Modifier
            .border(
                width = borderWidth,
                color = borderColor,
                shape = CircleShape
            )
            .padding(borderWidth)
            .size(size)
            .background(backgroundColor, shape = CircleShape)
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "Start",
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 25.sp,
                fontWeight = FontWeight(300),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )
    }
}


@Composable
fun ControlButton(
    borderColor: Color,
    backgroundColor: Color,
    borderWidth: Dp,
    size: Dp,
    onClick: () -> Unit) {
    val isClicked by remember { mutableStateOf(false) }
    val currentBorderColor = if (isClicked) backgroundColor else borderColor
    val currentBackgroundColor = if (isClicked) borderColor else backgroundColor
    onClick().apply {
        isClicked != isClicked
    }
}



@Preview
@Composable
fun CircleStartPreview() {
    CircleWithBorder(
        Color(0xFF33FF00),
        Color(0x00FFFFFF),
        5.dp,
        95.dp
    )
}