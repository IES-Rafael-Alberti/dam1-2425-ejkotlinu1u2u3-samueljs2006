package com.dam1.EjerciciosBasicos.ejercicioU3.diccionarios

fun mostrarCreditos(asignaturas: Map<String, Int>) {
    var totalCreditos = 0

    for ((asignatura, creditos) in asignaturas) {
        println("$asignatura tiene $creditos créditos.")
        totalCreditos += creditos
    }

    println("El número total de créditos del curso es $totalCreditos.")
}

fun main() {
    val asignaturas = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)

    mostrarCreditos(asignaturas)
}
