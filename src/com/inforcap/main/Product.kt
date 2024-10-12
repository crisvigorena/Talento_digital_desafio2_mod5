package com.inforcap.main


data class Product(
    val id: Int,
    var name: String,
    val description: String?,
    var isAvailable: Boolean = true,
    var isEnable: Boolean = true,
    var stock: Int = 0,
)
fun String?.showNA(description: String?): String = description?: "N/A"

fun Boolean.YesOrNo(isTrue:Boolean): String = if(isTrue) "Si" else "No"

fun Int.hasStock(stock: Int): String = if(stock>0) stock.toString() else "Sin stock"