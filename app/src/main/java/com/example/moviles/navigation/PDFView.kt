package com.example.moviles.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//
@Composable
fun PDFView(generarReporte: ReportModel){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("No. de seccion:  ${generarReporte.numSeccion}")
        Text("Nombre del Seccion: ${generarReporte.nombreSeccion}")
        Text("Nombre de encargado (a): ${generarReporte.nombreEncargado}")

    }
}

@Preview(showBackground = true)
@Composable
fun PDFPreview(){
    val reporte = ReportModel("1", "Omar", "Infanteria")
    PDFView(generarReporte = reporte)
}