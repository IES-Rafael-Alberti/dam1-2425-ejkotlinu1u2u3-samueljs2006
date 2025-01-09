package com.dam1.EjerciciosBasicos.ejercicioU3.listasytuplas

fun esPalindromo(palabra: String): Boolean {
    val palabraLimpia = palabra.lowercase().replace(" ", "")
    return palabraLimpia == palabraLimpia.reversed()
}

fun main() {
    print("Introduce una palabra: ")
    val palabra = readLine() ?: ""

    if (esPalindromo(palabra)) {
        println("\"$palabra\" es un palíndromo.")
    } else {
        println("\"$palabra\" no es un palíndromo.")
    }
}
