package com.inforcap.main



import com.inforcap.main.Product
fun main() {

        val products = populateData().values.sortedByDescending { it?.stock }

        products.forEach {
            println("+++++++++++++++++++++++++++++++++++++++++++++")
            val product = it
            println(
                "ID: ${product?.id} " +
                        "\nNOMBRE: ${product?.name?.uppercase()} " +
                        "\nDESCRIPCIÓN: ${product?.description.showNA(product?.description)} " +
                        "\nDISPONIBLE: ${product?.isAvailable?.YesOrNo(product.isAvailable)} " +
                        "\nHABILITADO  ${product?.isEnable?.YesOrNo(product.isEnable)} " +
                        "\nSTOCK: ${product?.stock?.hasStock(product.stock)}"
            )
            println("+++++++++++++++++++++++++++++++++++++++++++++")
        }
    }

    /**
     * Puedes crear extensiones para resolver 2,3,4 y 5
     */

// ejemplo:
    fun String.showNA(): String = "N/A"


    /**
     * ADVERTENCIA: No modificar la funcion populateData() o los datos
     */
    fun populateData(): MutableMap<Int, com.inforcap.main.Product?> =
        mutableMapOf(
            1 to Product(
                id = 100,
                name = "Lapiz",
                description = null,
                isAvailable = true,
                isEnable = true,
                stock = 20
            ),
            2 to Product(
                id = 101,
                name = "Hoja de oficio",
                description = "Hojas para impresora",
                isAvailable = false,
                isEnable = true,
                stock = 150
            ),
            3 to Product(
                id = 102,
                name = "Hoja de carta",
                description = "Hojas para impresora",
                isAvailable = true,
                isEnable = true,
                stock = 100
            ),
            4 to Product(
                id = 103,
                name = "Corchetera",
                description = null,
                isAvailable = true,
                isEnable = false,
                stock = 150
            ),
            5 to Product(
                id = 104,
                name = "Tijeras",
                description = null,
                isAvailable = true,
                isEnable = true,
                stock = 100
            ),
            6 to Product(
                id = 105,
                name = "Sillas de oficina",
                description = null,
                isAvailable = false,
                isEnable = true,
                stock = 0
            ),
        )

