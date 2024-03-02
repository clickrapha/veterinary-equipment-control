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
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.vetequipament.control.LocalDim
import com.vetequipament.control.ui.theme.LocalColor



@Composable
fun CircleWithBorder(
    buttonText: String,
    buttonColor: Color,
    onClick: () -> Unit
) {
    val dimens = LocalDim.current
    val colors = LocalColor.current
    var currentButtonColor by remember { mutableStateOf(buttonColor) }
    var currentBackgroundColor by remember { mutableStateOf(colors.backgroundButtonColor) }
    var currentTextButtonColor by remember { mutableStateOf(colors.textColor) }
    Box(
        modifier = Modifier
            .border(
                width = dimens.buttonBorderWidth,
                color = currentButtonColor,
                shape = CircleShape
            )
            .padding(dimens.buttonBorderWidth)
            .size(dimens.buttonSize)
            .background(currentBackgroundColor, shape = CircleShape)
            .pointerInput(Unit) {
                awaitPointerEventScope {
                    while (true) {
                        val event = awaitPointerEvent()
                        if (event.type == PointerEventType.Press) {
                            val tempBgColor = currentBackgroundColor
                            currentBackgroundColor = currentButtonColor
                            currentButtonColor = tempBgColor
                            currentTextButtonColor = tempBgColor
                            onClick()
                        } else if (event.type == PointerEventType.Release) {
                            val tempBgColor = currentBackgroundColor
                            currentBackgroundColor = currentButtonColor
                            currentButtonColor = tempBgColor
                            currentTextButtonColor = colors.textColor
                        }
                    }
                }
            }
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = buttonText,
            fontWeight = FontWeight(500),
            style = TextStyle(
                fontSize = dimens.textButtonFontSize,
                color = currentTextButtonColor,
                textAlign = TextAlign.Center,
                letterSpacing = dimens.textButtonLetterSpacing,
            )
        )
    }
}


@Composable
fun ControlButton(
    buttonText: String,
    buttonColor: Color,
    onClick: () -> Unit) {
    CircleWithBorder(buttonText, buttonColor, onClick)
}



@Preview
@Composable
fun CircleStartPreview() {
    val colors = LocalColor.current
    ControlButton(
        "Start",
        colors.startColor,
        {}
    )
}