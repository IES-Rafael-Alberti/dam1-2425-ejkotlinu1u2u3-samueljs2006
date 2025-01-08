package com.dam1.EjerciciosBasicos.ejerciciosU2.iterativos

fun generarTriangulo(n: Int) {
    for (i in 1..n step 2) {
        for (j in i downTo 1 step 2) {
            print("$j ")
        }
        println()
    }
}

fun main() {
    print("Ingrese un número entero: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero > 0) {
        generarTriangulo(numero)
    } else {
        println("Por favor, ingresa un número entero positivo.")
    }
}
