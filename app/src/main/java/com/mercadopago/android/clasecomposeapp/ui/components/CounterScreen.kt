package com.mercadopago.android.clasecomposeapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen() {

    val isIncreasing = false
    var counter by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            RadioButtonComponent(isSelected = !isIncreasing, name = "Decrease")
            RadioButtonComponent(isSelected = isIncreasing, name = "Increase")
        }
        Text(text = counter.toString(), fontSize = 50.sp, color = Color.Black)
        Row {
            Button(
                buttonText = "Increase",
                onClick = { counter++ }
            )
            Button(
                buttonText = "Decrease",
                onClick = { counter-- }
            )
        }
    }
}

@Composable
@Preview
private fun CounterScreenPreview() {
    CounterScreen()
}
