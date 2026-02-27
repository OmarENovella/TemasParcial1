package com.example.moviles.listas
import com.example.moviles.R


class ProductViewModel {
    fun getProducts() : List<ProductModel> {

        var productList = mutableListOf<ProductModel>()

        productList.add(
            ProductModel(
                image = R.drawable.dpb,
                title = "Dropout Bear",
                shipping = "llega mañana",
                cost = 150f,
                rating = 5f
            )
        )

        productList.add(
            ProductModel(
                image = R.drawable.dp909,
                title = "Daft Punk",
                contentDescription = "WDPK",
                rating = 3.5f,
                shipping = "Llega hoy",
                cost = 1500f
            )
        )

        productList.add(
            ProductModel(
                image = R.drawable.kanye,
                title = "Ye",
                contentDescription = "Ye",
                rating = 1.5f,
                shipping = "Llega hoy",
                cost = 5f
            )
        )

        productList.add(
            ProductModel(
                image = R.drawable.jayz,
                title = "Jay-Z",
                contentDescription = "jay-z",
                rating = 3.5f,
                shipping = "Llega el viernes",
                cost = .2f
            )
        )

        productList.add(
            ProductModel(
                image = R.drawable.vmas2009,
                title = "Taylor ZZZwift",
                contentDescription = "jay-z",
                rating = 4.5f,
                shipping = "Llega el viernes",
                cost = 10f
            )
        )

        productList.add(
            ProductModel(
                image = R.drawable.macbook,
                title = "MacBook 13 pulgadas 2026",
                contentDescription = "mac",
                rating = 4.5f,
                shipping = "Llega el domingo 22 de febrero",
                cost = 13750f
            )
        )

        return productList

    }
}