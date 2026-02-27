package com.example.moviles.componentes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun Cajas(){
    GenCajas(alignment = Alignment.TopCenter, boxesSize = 25.dp, size = 100.dp)
    GenCajas(alignment = Alignment.CenterStart, boxesSize = 25.dp, size = 100.dp)
    GenCajas(alignment = Alignment.CenterEnd, boxesSize = 25.dp, size = 100.dp)
    GenCajas(alignment = Alignment.BottomCenter, boxesSize = 25.dp, size = 100.dp)
}

@Composable
fun GenCajas(alignment: Alignment, size: Dp, boxesSize: Dp){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = alignment) {
        Box(modifier = Modifier.size(size)) {

            Text(
                "A",
                Modifier.background(color = Color.Red).align(Alignment.TopStart).size(boxesSize),
                color = Color.White
            )
            Text(
                "B",
                Modifier.background(color = Color.Blue).align(Alignment.TopCenter).size(boxesSize),
                color = Color.White
            )
            Text(
                "C",
                Modifier.background(color = Color.Green).align(Alignment.TopEnd).size(boxesSize),
                color = Color.White
            )
            Text(
                "D",
                Modifier.background(color = Color.Magenta).align(Alignment.CenterStart).size(boxesSize),
                color = Color.White
            )
            Text(
                "E",
                Modifier.background(color = Color.Cyan).align(Alignment.Center).size(boxesSize),
                color = Color.White
            )
            Text(
                "F",
                Modifier.background(color = Color.LightGray).align(Alignment.CenterEnd).size(boxesSize),
                color = Color.White
            )
            Text(
                "G",
                Modifier.background(color = Color.Yellow).align(Alignment.BottomStart).size(boxesSize),
                color = Color.White
            )
            Text(
                "H",
                Modifier.background(color = Color.DarkGray).align(Alignment.BottomCenter).size(boxesSize),
                color = Color.White
            )
            Text(
                "I",
                Modifier.background(color = Color.Transparent).align(Alignment.BottomEnd).size(boxesSize),
                color = Color.Black
            )
        }
    }
}

