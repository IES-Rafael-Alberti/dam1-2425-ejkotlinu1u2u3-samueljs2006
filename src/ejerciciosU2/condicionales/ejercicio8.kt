package com.dam1.EjerciciosBasicos.ejerciciosU2.condicionales

fun nivel(puntuacion: Double): String {
    return when {
        puntuacion == 0.0 -> "nivel inaceptable ${2400 * puntuacion}"
        puntuacion == 0.4 -> "nivel aceptable ${2400 * puntuacion}"
        puntuacion >= 0.6 -> "nivel meritorio ${2400 * puntuacion}"
        else -> "*ERROR* Puntuación no válida"
    }
}

fun main() {
    try {
        print("Introduce puntuación: ")
        val puntuacion = readLine()?.toDoubleOrNull() ?: throw NumberFormatException()
        val resultado = nivel(puntuacion)
        println(resultado)
    } catch (e: NumberFormatException) {
        println("*ERROR* Introduce números, no letras")
    }
}
