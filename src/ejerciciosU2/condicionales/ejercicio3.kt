package com.dam1.EjerciciosBasicos.ejerciciosU2.condicionales

fun division(n1: Int, n2: Int): String {
    return try {
        if (n2 == 0) {
            "*ERROR* No se puede dividir entre 0"
        } else {
            (n1 / n2.toDouble()).toString()
        }
    } catch (e: NumberFormatException) {
        "*ERROR* de conversión!"
    }
}

fun main() {
    try {
        print("Introduce un número: ")
        val n1 = readLine()?.toIntOrNull() ?: throw NumberFormatException()

        print("Introduce otro número: ")
        val n2 = readLine()?.toIntOrNull() ?: throw NumberFormatException()

        println(division(n1, n2))
    } catch (e: NumberFormatException) {
        println("*ERROR* de conversión!")
    }
}
