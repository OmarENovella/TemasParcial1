package com.example.moviles.matematicas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

//@Preview(showBackground = true)
@Composable
fun NumTextField(modifier: Modifier, fill: (String) -> Unit){

    var number by remember {
        mutableStateOf(value = "")
    }

    Column(
        modifier = modifier
            .background(color = Color.Blue)
    ) {

        Text("Ingresa un numero")

        TextField(value = number ,onValueChange = { textoescrito ->

            if (textoescrito.toIntOrNull() != null){
                number = textoescrito.toInt().toString()
                fill(number)
            }


        } )
    }
}

@Preview(showBackground = true)
@Composable
fun NumTextFieldPreview(){
    var texto by remember { mutableStateOf("") }
    Column() {
        Text(texto)
        NumTextField(
            modifier = Modifier
                .fillMaxWidth(),
            {

            }
        )
    }
}