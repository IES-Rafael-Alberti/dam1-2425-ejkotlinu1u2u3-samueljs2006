package com.dam1.EjerciciosBasicos.ejerciciosU2.condicionales

import java.util.*

fun tuNombre(): String {
    print("¿Cuál es tu nombre? : ")
    return readLine()?.uppercase(Locale.getDefault()) ?: ""
}

fun cualSexo(): String {
    while (true) {
        print("¿Qué sexo eres? hombre/mujer: ")
        val sexo = readLine()?.lowercase(Locale.getDefault())
        if (sexo in listOf("hombre", "mujer")) {
            return sexo!!
        }
        println("Entrada no válida. Por favor, ingresa 'hombre' o 'mujer'.")
    }
}

fun determinarGrupo(nombre: String, sexo: String): String {
    return if (sexo == "mujer") {
        if (nombre[0] < 'M') "Grupo A (mujer)" else "Grupo B (mujer)"
    } else if (sexo == "hombre") {
        if (nombre[0] > 'N') "Grupo A (hombre)" else "Grupo B (hombre)"
    } else {
        "Sexo no válido"
    }
}

fun main() {
    val nombre = tuNombre()
    val sexo = cualSexo()
    val grupo = determinarGrupo(nombre, sexo)
    println("Tu grupo es: $grupo")
}
