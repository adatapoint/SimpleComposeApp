package com.mercadopago.android.clasecomposeapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Button(
    buttonText: String,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() },
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, Color.White)
    ) {
        Text(text = buttonText, color = Color.White)
    }
}

@Composable
@Preview
private fun ButtonPreview() {
    Column {
        Button("Decrease") {}
        Button("Increase", {})
        Button("Reset", {})
    }
}
