package com.dam1.EjerciciosBasicos.ejercicioU3.conjuntos

fun obtenerConsonantes(vocales: Set<Char>): Set<Char> {
    val alfabeto = ('a'..'z').toSet()
    return alfabeto.subtract(vocales)
}

fun obtenerLetrasComunes(consonantes: Set<Char>, vocales: Set<Char>): Set<Char> {
    return consonantes.intersect(vocales)
}

fun main() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    val consonantes = obtenerConsonantes(vocales)

    val letrasComunes = obtenerLetrasComunes(consonantes, vocales)

    println("Conjunto de consonantes: $consonantes")
    println("Conjunto de letras comunes entre vocales y consonantes: $letrasComunes")
}
