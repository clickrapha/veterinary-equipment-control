package com.vetequipament.control.ui

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.vetequipament.control.ui.theme.LocalColor
@Preview(uiMode = Configuration.UI_MODE_NIGHT_MASK, showSystemUi = true, showBackground = true)
@Composable
fun Control() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .rotate(180f)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            val controlModifier = Modifier.fillMaxWidth()
            ControlFirstLineButtons(controlModifier)
            ControlSecondLineButtons(controlModifier)
            ControlThirdLineButtons(controlModifier)
            ControlFourthLineButtons(controlModifier)
            ControlFifthLineButtons(controlModifier)
            ControlSixthLineButtons(controlModifier)
            ControlSeventhLineButtons(controlModifier)
        }
    }
}

@Composable
fun ControlFirstLineButtons(modifier: Modifier) {
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly) {
        val colors = LocalColor.current
        ControlButton(
            "Start",
            colors.startColor,
            {}
        )
        ControlButton(
            "Inc.",
            colors.commandColor,
            {}
        )
        ControlButton(
            "Stop",
            colors.stopColor,
            {}
        )
    }
}

@Composable
fun ControlSecondLineButtons(modifier: Modifier) {
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly) {
        val colors = LocalColor.current
        ControlButton(
            "Left",
            colors.commandColor,
            {}
        )
        ControlButton(
            "Mode",
            colors.commandColor,
            {}
        )
        ControlButton(
            "Right",
            colors.commandColor,
            {}
        )
    }
}

@Composable
fun ControlThirdLineButtons(modifier: Modifier) {
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly) {
        val colors = LocalColor.current
        ControlButton(
            "Purge",
            colors.cleanColor,
            {}
        )
        ControlButton(
            "Dec.",
            colors.commandColor,
            {}
        )
        ControlButton(
            "Conf.",
            colors.confColor,
            {}
        )
    }
}

@Composable
fun ControlFourthLineButtons(modifier: Modifier) {
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly) {
        val colors = LocalColor.current
        ControlButton(
            "1",
            colors.numberColor,
            {}
        )
        ControlButton(
            "2",
            colors.numberColor,
            {}
        )
        ControlButton(
            "3",
            colors.numberColor,
            {}
        )
    }
}

@Composable
fun ControlFifthLineButtons(modifier: Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        val colors = LocalColor.current
        ControlButton(
            "4",
            colors.numberColor,
            {}
        )
        ControlButton(
            "5",
            colors.numberColor,
            {}
        )
        ControlButton(
            "6",
            colors.numberColor,
            {}
        )
    }
}

@Composable
fun ControlSixthLineButtons(modifier: Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        val colors = LocalColor.current
        ControlButton(
            "6",
            colors.numberColor,
            {}
        )
        ControlButton(
            "7",
            colors.numberColor,
            {}
        )
        ControlButton(
            "8",
            colors.numberColor,
            {}
        )
    }
}

@Composable
fun ControlSeventhLineButtons(modifier: Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        val colors = LocalColor.current
        ControlButton(
            "Clear",
            colors.cleanColor,
            {}
        )
        ControlButton(
            "0",
            colors.numberColor,
            {}
        )
        ControlButton(
            "#",
            colors.confColor,
            {}
        )
    }
}