package com.dam1.EjerciciosBasicos.ejerciciosU2.condicionales

fun main() {
    print("Escribe el importe con IVA: ")
    val ivaConImporte = readLine()?.toFloatOrNull() ?: return println("Entrada inválida")

    val sinIVA = ivaConImporte / 1.21
    val ivaCalculado = ivaConImporte - sinIVA

    println("Precio final: %.2f".format(ivaCalculado))
}