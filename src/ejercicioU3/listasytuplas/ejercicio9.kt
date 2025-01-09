package com.dam1.EjerciciosBasicos.ejercicioU3.listasytuplas

fun contarVocales(palabra: String): Map<Char, Int> {
    val vocales = "aeiou"
    val conteo = mutableMapOf<Char, Int>()

    for (vocal in vocales) {
        conteo[vocal] = 0
    }

    for (letra in palabra.lowercase()) {
        if (letra in vocales) {
            conteo[letra] = conteo.getOrDefault(letra, 0) + 1
        }
    }

    return conteo
}

fun main() {
    print("Introduce una palabra: ")
    val palabra = readLine() ?: ""

    val conteo = contarVocales(palabra)

    println("Número de veces que aparece cada vocal:")
    for ((vocal, cantidad) in conteo) {
        println("${vocal.uppercase()}: $cantidad")
    }
}
