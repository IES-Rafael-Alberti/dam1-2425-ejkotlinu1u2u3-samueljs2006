package com.dam1.EjerciciosBasicos.ejerciciosU2.excepciones

fun solicitarNumeroPositivo(): Int {
    var numero: Int?
    do {
        println("Introduce un número entero positivo:")
        val entrada = readLine()
        numero = entrada?.toIntOrNull()
        if (numero == null || numero < 0) {
            println("El número introducido no es válido. Por favor, inténtalo de nuevo.")
        }
    } while (numero == null || numero < 0)
    return numero
}

fun mostrarCuentaAtras(numero: Int) {
    println("Cuenta atrás:")
    for (i in numero downTo 0) {
        print(if (i != 0) "$i, " else "$i\n")
    }
}

fun main() {
    val numero = solicitarNumeroPositivo()
    mostrarCuentaAtras(numero)
}