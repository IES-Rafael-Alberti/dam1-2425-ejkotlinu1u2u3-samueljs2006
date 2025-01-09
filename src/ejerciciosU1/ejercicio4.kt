package com.dam1.EjerciciosBasicos.ejerciciosU1

fun convertirTemperatura(): String {
    print("Escribe un grado en Fahrenheit: ")
    val fahrenheit = readLine()?.toFloatOrNull() ?: return "Entrada inválida"

    val celsius = (fahrenheit - 32) * 5 / 9
    return "%.2fºC (%.2fºF)".format(celsius, fahrenheit)
}

fun main() {
    val resultado = convertirTemperatura()
    println(resultado)
}
