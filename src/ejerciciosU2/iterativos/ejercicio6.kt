package com.dam1.EjerciciosBasicos.ejerciciosU2.iterativos

fun triangulo(altura: Int) {
    for (i in 1..altura) {
        println("*".repeat(i))
    }
}

fun main() {
    print("Introduce un número entero para la altura del triángulo: ")
    val altura = readLine()?.toIntOrNull()

    if (altura != null && altura > 0) {
        triangulo(altura)
    } else {
        println("Por favor, introduce un número entero positivo para la altura.")
    }
}
