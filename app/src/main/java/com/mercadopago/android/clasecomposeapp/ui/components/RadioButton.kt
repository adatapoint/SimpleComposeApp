package com.mercadopago.android.clasecomposeapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RadioButtonComponent(
    isSelected: Boolean,
    name: String
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(selected = isSelected, onClick = { /*TODO*/ })
        Text(
            text = name,
            color = if (isSelected) Color.Black else Color.Gray,
            fontSize = 17.sp
        )
    }
}

@Composable
@Preview
private fun RadioButtonPreview() {
    Column {
        RadioButtonComponent(
            isSelected = true,
            name = "Decrease"
        )
        RadioButtonComponent(
            isSelected = false,
            name = "Increase"
        )
    }
}