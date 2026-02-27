package com.example.moviles.listas

import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable
fun PreProductView(){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
        ) {
            generateRow(
                R.drawable.macbook,
                imgContDesc = "MacBook",
                title = "MacBook Pro 13 pulgadas",
                rating = "4.8 estrellas",
                cost = "12,998",
                shipping = "Llega el viernes"
            )
        }
    }
}

@Composable
fun ProductView(
    product: ProductModel
//    title: String,
//    rating: Float,
//    cost: Float,
//    shipping: String,
//    @DrawableRes imageRoute: Int,
//    contentDescription: String = "",
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
        ) {
            generateRow(
                product.image,
                imgContDesc = product.contentDescription,
                title = product.title,
                rating = product.rating.toString(),
                cost = product.cost.toString(),
                shipping = product.shipping
            )
        }
    }
}

@Composable
fun generateRow(
    @DrawableRes route: Int,
    imgContDesc: String = "",
    title: String,
    rating: String,
    cost: String,
    shipping: String

){
    Row() {

        androidx.compose.foundation.Image(
            painter = painterResource(route),
            contentDescription = imgContDesc,
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterVertically)
        )

        Column(
            modifier = Modifier
                .padding(5.dp)
        ) {

            Spacer(modifier = Modifier.size(10.dp))

            Text(title, fontSize = 20.sp)
            Text("⭐$rating estrellas", fontSize = 17.sp)
            Text("$$cost MXN", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Text(shipping)

            Spacer(modifier = Modifier.size(10.dp))

            val context = LocalContext.current
            Button(
                onClick = {
                    Toast.makeText(context,
                        "Agregaste $title al carrito",
                        Toast.LENGTH_LONG
                    ).show()

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                //modifier = Modifier.size(height = 50.dp, width = 100.dp)
            ) {
                Text("Agregar al Carrito")
            }
            Spacer(modifier = Modifier.size(5.dp))

        }
    }
}