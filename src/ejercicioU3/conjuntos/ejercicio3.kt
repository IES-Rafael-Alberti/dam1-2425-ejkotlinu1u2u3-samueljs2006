package com.dam1.EjerciciosBasicos.ejercicioU3.conjuntos

import kotlin.collections.*

fun conjuntoPotencia(s: Set<Int>): Set<Set<Int>> {
    val potencia = mutableSetOf<Set<Int>>()
    for (r in 0..s.size) {
        val combinaciones = s.toList().combinations(r)
        for (comb in combinaciones) {
            potencia.add(comb.toSet())
        }
    }
    return potencia
}

// Función de extensión para generar combinaciones
fun <T> List<T>.combinations(k: Int): List<List<T>> {
    if (k == 0) return listOf(emptyList())
    if (k == size) return listOf(this)

    return (0 until size).flatMap { i ->
        this.subList(i + 1, size).combinations(k - 1).map { listOf(this[i]) + it }
    }
}

fun main() {
    println("Ingrese los elementos del conjunto separados por espacios:")
    val entrada = readLine()?.trim() ?: ""

    val conjunto = entrada.split(" ")
        .mapNotNull { it.toIntOrNull() }
        .toSet()

    val resultado = conjuntoPotencia(conjunto)

    println("\nConjunto potencia:")
    for (subconjunto in resultado) {
        println(subconjunto)
    }
}
