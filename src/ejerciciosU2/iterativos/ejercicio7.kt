package com.dam1.EjerciciosBasicos.ejerciciosU2.iterativos

fun imprimirTabla(numero: Int) {
    println("\nTabla del $numero:")
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun main() {
    for (numero in 1..10) {
        imprimirTabla(numero)
    }
}
