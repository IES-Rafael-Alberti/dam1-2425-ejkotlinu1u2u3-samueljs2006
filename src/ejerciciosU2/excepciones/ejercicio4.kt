package com.dam1.EjerciciosBasicos.ejerciciosU2.excepciones

fun obtenerEntrada(): Int {
    print("Introduce un número entero: ")
    val entrada = readLine()
    return entrada?.toIntOrNull() ?: throw IllegalArgumentException("La entrada no es correcta")
}

fun esPositivo(numero: Int): Boolean {
    return numero > 0
}

fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}

fun analizarNumero(numero: Int) {
    if (esPositivo(numero)) {
        println("El número es positivo.")
    } else {
        println("El número es negativo o cero.")
    }

    if (esPar(numero)) {
        println("El número es par.")
    } else {
        println("El número es impar.")
    }
}

fun main() {
    try {
        val numero = obtenerEntrada()
        println("Has introducido el número: $numero")
        analizarNumero(numero)
    } catch (e: Exception) {
        println("La entrada no es correcta")
        throw e
    }
}