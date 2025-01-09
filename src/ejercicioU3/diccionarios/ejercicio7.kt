package com.dam1.EjerciciosBasicos.ejercicioU3.diccionarios

fun agregarArticulo(cesta: MutableMap<String, Double>): Boolean {
    print("Ingrese el nombre del artículo (o 'salir' para terminar): ")
    val articulo = readLine()?.trim()

    if (articulo?.lowercase() == "salir") {
        return false
    }

    try {
        print("Ingrese el precio de '$articulo': ")
        val precio = readLine()?.toDoubleOrNull()

        if (precio == null) {
            println("Por favor, ingrese un precio válido.")
        } else if (precio < 0) {
            println("El precio no puede ser negativo. Inténtelo de nuevo.")
        } else {
            if (articulo != null) {
                cesta[articulo] = precio
            }
        }
    } catch (e: Exception) {
        println("Hubo un error al procesar el precio.")
    }

    return true
}

fun mostrarCesta(cesta: Map<String, Double>) {
    println("\nLista de la compra")
    println("-".repeat(30))
    var total = 0.0
    for ((articulo, precio) in cesta) {
        println("${articulo.padEnd(20)} ${"%.2f".format(precio)}€")
        total += precio
    }
    println("-".repeat(30))
    println("${"Total".padEnd(20)} ${"%.2f".format(total)}€")
}

fun main() {
    val cesta = mutableMapOf<String, Double>()
    println("Bienvenido a la cesta de la compra.")
    println("Escribe 'salir' cuando termines de añadir artículos.")

    var continuar = true
    while (continuar) {
        continuar = agregarArticulo(cesta)
    }

    mostrarCesta(cesta)
}
