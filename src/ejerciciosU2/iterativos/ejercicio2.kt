package com.dam1.EjerciciosBasicos.ejerciciosU2.iterativos

fun todosAniosCumplidos(edad: Int) {
    for (i in 0..edad) {
        println(i)
    }
}

fun main() {
    print("Introduce tu edad: ")
    val edad = readLine()?.toIntOrNull() ?: return println("Por favor, ingresa un número válido.")
    todosAniosCumplidos(edad)
}
