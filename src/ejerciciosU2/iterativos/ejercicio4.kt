package com.dam1.EjerciciosBasicos.ejerciciosU2.iterativos

fun cuentaAtras(num: Int) {
    val atras = (num downTo 0).map { it.toString() }
    println(atras.joinToString(", "))
}

fun main() {
    print("Introduce un número entero positivo: ")
    val num = readLine()?.toIntOrNull()

    if (num != null && num >= 0) {
        cuentaAtras(num)
    } else {
        println("Por favor, introduce un número entero positivo.")
    }
}
