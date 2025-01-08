package com.dam1.EjerciciosBasicos.ejerciciosU2.excepciones

class NumeroNegativoError(message: String) : Exception(message)

fun mostrarImparesHastaN(n: Int): String {
    val impares = (1..n).filter { it % 2 != 0 }.map { it.toString() }
    return impares.joinToString(", ")
}

fun main() {
    try {
        print("Introduce un número entero positivo: ")
        val numero = readLine()?.toIntOrNull()

        if (numero == null) {
            throw IllegalArgumentException("Introduce un número no una letra")
        }

        if (numero < 0) {
            throw NumeroNegativoError("No se permiten números negativos.")
        } else if (numero == 0) {
            throw IllegalArgumentException("El número debe ser mayor que cero.")
        }

        println(mostrarImparesHastaN(numero))

    } catch (e: NumeroNegativoError) {
        println("Error: ${e.message} no se pueden números negativos")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
