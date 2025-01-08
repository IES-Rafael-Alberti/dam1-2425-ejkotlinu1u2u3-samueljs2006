package com.dam1.EjerciciosBasicos.ejercicioU3.listasytuplas

fun main() {
    val numerosGanadores = mutableListOf<Int>()

    println("Introduce los números ganadores de la lotería primitiva:")
    for (i in 1..6) {
        print("Introduce el número $i: ")
        val numero = readLine()?.toIntOrNull()
        if (numero != null) {
            numerosGanadores.add(numero)
        } else {
            println("Por favor, introduce un número válido.")
        }
    }

    numerosGanadores.sort()

    println("\nLos números ganadores ordenados son:")
    println(numerosGanadores)
}
