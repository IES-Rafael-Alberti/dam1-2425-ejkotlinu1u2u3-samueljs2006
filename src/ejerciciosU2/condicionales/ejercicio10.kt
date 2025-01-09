package com.dam1.EjerciciosBasicos.ejerciciosU2.condicionales

fun mostrarMenuIngredientes(ingredientes: List<String>): String {
    // Muestra el menú de ingredientes y permite al usuario elegir uno.
    ingredientes.forEachIndexed { index, ingrediente ->
        println("${index + 1}. $ingrediente")
    }
    print("Elige un ingrediente (ingresa el número correspondiente): ")
    val eleccion = readLine()?.toIntOrNull()
    return if (eleccion != null && eleccion in 1..ingredientes.size) {
        ingredientes[eleccion - 1]
    } else {
        println("Opción no válida.")
        ""
    }
}

fun main() {
    val ingredientesVegetarianos = listOf("Pimiento", "Tofu")
    val ingredientesNoVegetarianos = listOf("Peperoni", "Jamón", "Salmón")

    print("¿Quieres una pizza vegetariana? (si/no): ")
    val tipoPizza = readLine()?.trim()?.lowercase()

    if (tipoPizza == "si") {
        println("Ingredientes vegetarianos disponibles:")
        val ingredienteElegido = mostrarMenuIngredientes(ingredientesVegetarianos)
        if (ingredienteElegido.isNotEmpty()) {
            println("\nTu pizza vegetariana llevará los siguientes ingredientes:")
            println("- Mozzarella")
            println("- Tomate")
            println("- $ingredienteElegido")
        }
    } else if (tipoPizza == "no") {
        println("Ingredientes no vegetarianos disponibles:")
        val ingredienteElegido = mostrarMenuIngredientes(ingredientesNoVegetarianos)
        if (ingredienteElegido.isNotEmpty()) {
            println("\nTu pizza no vegetariana llevará los siguientes ingredientes:")
            println("- Mozzarella")
            println("- Tomate")
            println("- $ingredienteElegido")
        }
    } else {
        println("Opción no válida.")
    }
}
