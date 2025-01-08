package com.dam1.EjerciciosBasicos.ejercicioU3.listasytuplas

fun obtenerAsignaturasARepetir(asignaturas: List<String>): List<String> {
    val notas = mutableMapOf<String, Double>()

    for (asignatura in asignaturas) {
        print("¿Qué nota has sacado en $asignatura? (0 a 10): ")
        val nota = readLine()?.toDoubleOrNull()
        if (nota != null) {
            notas[asignatura] = nota
        } else {
            println("Nota no válida, intenta nuevamente.")
        }
    }

    return asignaturas.filter { (notas[it] ?: 0.0) < 5 }
}

fun main() {
    val asignaturas = listOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val asignaturasARepetir = obtenerAsignaturasARepetir(asignaturas)

    if (asignaturasARepetir.isNotEmpty()) {
        println("\nTienes que repetir las siguientes asignaturas:")
        for (asignatura in asignaturasARepetir) {
            println("- $asignatura")
        }
    } else {
        println("\n¡Felicidades! No tienes asignaturas que repetir.")
    }
}
