package com.example.moviles
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyTextView(modifier: Modifier){
    /*val myFontColor = Color.Red
    val tamanhoFuente = 50.sp*/
    Text(
        modifier = modifier,
        text = stringResource(R.string.hola_mundo),
        color = Color.Green,
        fontSize = 80.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 20.sp,
        lineHeight = 77.sp,
        textAlign = TextAlign.Justify,
        textDecoration = TextDecoration.Underline,
        maxLines = 10,
        //overflow = TextOverflow.Ellipsis
    )
}