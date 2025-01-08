package com.dam1.EjerciciosBasicos.ejerciciosU1

fun main() {
    print("Escribe tu nombre completo: ")
    val nombreCompleto = readLine() ?: return println("Entrada inválida")

    println(nombreCompleto.lowercase())
    println(nombreCompleto.uppercase())
    println(nombreCompleto.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() })
}
