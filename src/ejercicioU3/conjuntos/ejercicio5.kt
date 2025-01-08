package com.dam1.EjerciciosBasicos.ejercicioU3.conjuntos

fun obtenerPares(numeros: Set<Int>): Set<Int> {
    return numeros.filter { it % 2 == 0 }.toSet()
}

fun obtenerMultiplosDeTres(numeros: Set<Int>): Set<Int> {
    return numeros.filter { it % 3 == 0 }.toSet()
}

fun obtenerInterseccion(conjunto1: Set<Int>, conjunto2: Set<Int>): Set<Int> {
    return conjunto1.intersect(conjunto2)
}

fun main() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = obtenerPares(numeros)
    val multiplosDeTres = obtenerMultiplosDeTres(numeros)
    val paresYMultiplosDeTres = obtenerInterseccion(pares, multiplosDeTres)

    println("Conjunto de números pares: $pares")
    println("Conjunto de múltiplos de tres: $multiplosDeTres")
    println("Intersección (pares y múltiplos de tres): $paresYMultiplosDeTres")
}
