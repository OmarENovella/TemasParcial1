package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val colorElegido = Color.Black

@Preview(showBackground = true)
@Composable
fun Modificador(){
    Text(
        text = "Fuer-za Regida",
        color = colorElegido,
        fontSize = 22.sp,
        modifier = Modifier
            .background(Color(color = 0xF54927))
            .padding(all = 7.dp)
            //.background(Color.Red)
            .padding(vertical = 14.dp)
            //.alpha(0.5f)
            .blur(0.8.dp)
            .border(width = 2.dp, Color.Blue,
                shape = RoundedCornerShape(7.dp),
            )
            .padding(6.dp)
            .shadow(elevation = 20.dp)
            .rotate(degrees = 360f)
    )
}