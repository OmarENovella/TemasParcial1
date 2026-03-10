package com.example.moviles.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ReportView(navHostController: NavHostController){

    var nombreSeccion by remember { mutableStateOf("") }
    var numSeccion by remember { mutableStateOf("") }
    var nombreEncargado by remember { mutableStateOf("") }

    Column(modifier =
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Reporte de Ventas")

        Button(onClick = {
            navHostController.popBackStack()
        }) {
            Text("Regresar")
        }

        TextField(value = nombreSeccion, onValueChange = {nombreSeccion = it}, label = {Text("Nombre de la seccion")})
        TextField(value = numSeccion, onValueChange = {numSeccion = it}, label = {Text("Numero de la seccion")})
        TextField(value = nombreEncargado, onValueChange = {nombreEncargado = it}, label = {Text("Nombre del encargado")})

        Button(onClick = {
            navHostController.navigate(ReportModel(numSeccion, nombreEncargado, nombreSeccion))
        }) {

            Text("Enviar datos")

        }

    }
}