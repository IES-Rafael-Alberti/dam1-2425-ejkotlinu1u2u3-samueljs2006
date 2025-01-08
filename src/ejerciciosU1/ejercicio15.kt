package com.dam1.EjerciciosBasicos.ejerciciosU1

fun main() {
    val interes = 0.04

    print("Introduce el dinero que tienes en el banco: ")
    val capital = readLine()?.toIntOrNull() ?: return println("Entrada inválida")

    val calculoInteres1 = capital * (1 + interes)
    val calculoInteres2 = calculoInteres1 * (1 + interes)
    val calculoInteres3 = calculoInteres2 * (1 + interes)

    println("Ahorros tras el primer año: %.2f".format(calculoInteres1))
    println("Ahorros tras el segundo año: %.2f".format(calculoInteres2))
    println("Ahorros tras el tercer año: %.2f".format(calculoInteres3))
}
