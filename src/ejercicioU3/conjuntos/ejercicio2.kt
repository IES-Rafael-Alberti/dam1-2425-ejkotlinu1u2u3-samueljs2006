package com.dam1.EjerciciosBasicos.ejercicioU3.conjuntos

fun solicitarNombres(nivel: String): Set<String> {
    println("Ingrese los nombres de los alumnos de $nivel (introduzca 'x' para finalizar):")
    val nombres = mutableSetOf<String>()

    var nombre: String
    do {
        print("Nombre: ")
        nombre = readLine()?.trim() ?: ""

        if (nombre.lowercase() != "x" && nombre.isNotEmpty()) {
            nombres.add(nombre)
        }
    } while (nombre.lowercase() != "x" && nombre.isNotEmpty())

    return nombres
}

fun main() {
    val nombresPrimaria = solicitarNombres("primaria")
    val nombresSecundaria = solicitarNombres("secundaria")

    val todosLosNombres = nombresPrimaria.union(nombresSecundaria)
    println("\nNombres de todos los alumnos (sin repeticiones):")
    println(todosLosNombres.joinToString(", "))

    val nombresRepetidos = nombresPrimaria.intersect(nombresSecundaria)
    println("\nNombres que se repiten entre primaria y secundaria:")
    if (nombresRepetidos.isNotEmpty()) {
        println(nombresRepetidos.joinToString(", "))
    } else {
        println("No hay nombres repetidos.")
    }

    val nombresUnicosPrimaria = nombresPrimaria.minus(nombresSecundaria)
    println("\nNombres de primaria que no están en secundaria:")
    if (nombresUnicosPrimaria.isNotEmpty()) {
        println(nombresUnicosPrimaria.joinToString(", "))
    } else {
        println("Todos los nombres de primaria están en secundaria.")
    }

    val todosPrimariaEnSecundaria = nombresPrimaria.all { it in nombresSecundaria }
    println("\n¿Todos los nombres de primaria están incluidos en secundaria?")
    println(if (todosPrimariaEnSecundaria) "Sí" else "No")
}
