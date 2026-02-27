package com.example.moviles.listas

data class ProductModel(
    val image: Int,
    val title: String,
    val contentDescription: String = "",
    val rating: Float,
    val shipping: String,
    val cost: Float
)
