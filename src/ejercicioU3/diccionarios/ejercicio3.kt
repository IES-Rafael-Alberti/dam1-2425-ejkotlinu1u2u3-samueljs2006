package com.dam1.EjerciciosBasicos.ejercicioU3.diccionarios

import java.util.*

fun calcularPrecio(frutas: Map<String, Double>, fruta: String, kilos: Double): String {
    return if (fruta in frutas) {
        val precio = frutas[fruta]!! * kilos
        "El precio de $kilos kilos de $fruta es ${"%.2f".format(precio)} euros."
    } else {
        "La fruta ingresada no está disponible."
    }
}

fun main() {
    val frutas = mapOf(
        "Plátano" to 1.35,
        "Manzana" to 0.80,
        "Pera" to 0.85,
        "Naranja" to 0.70
    )

    print("Ingrese el nombre de la fruta: ")
    val fruta = readLine()?.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        ?: ""

    try {
        print("Ingrese el número de kilos: ")
        val kilos = readLine()?.toDoubleOrNull()
        if (kilos != null && kilos > 0) {
            val resultado = calcularPrecio(frutas, fruta, kilos)
            println(resultado)
        } else {
            println("La cantidad de kilos debe ser un número positivo.")
        }
    } catch (e: Exception) {
        println("Por favor, ingrese un número válido para los kilos.")
    }
}
