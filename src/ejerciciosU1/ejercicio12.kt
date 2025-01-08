package com.dam1.EjerciciosBasicos.ejerciciosU1

fun main() {
    print("Introduce tu peso: ")
    val peso = readLine()?.toIntOrNull() ?: return println("Entrada inválida")

    print("Introduce tu estatura : ")
    val estatura = readLine()?.toIntOrNull() ?: return println("Entrada inválida")

    val estaturaEnMetros = estatura / 100.0
    val masaCorporal = peso / (estaturaEnMetros * estaturaEnMetros)

    println("Tu índice de masa corporal es %.2f".format(masaCorporal))
}
