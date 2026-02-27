import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Columnas(){
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxSize()
            .background(Color.Red)
            .padding(100.dp),
        horizontalAlignment = Alignment.End
        ) {
        Text("Hola\nXD")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Adios")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Que tal")
        Spacer(modifier = Modifier.height(20.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun Separadores(){
    Column(
        modifier = Modifier
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("7 Palabras:", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
        HorizontalDivider(color = Color.Green, thickness = 10.dp)
        Text("E", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
        Text("S", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
        Text("E", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
        Text("N", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
        Text("C", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
        Text("I", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
        Text("A", modifier = Modifier.fillMaxSize().weight(1f), color = Color.Green)
    }
}