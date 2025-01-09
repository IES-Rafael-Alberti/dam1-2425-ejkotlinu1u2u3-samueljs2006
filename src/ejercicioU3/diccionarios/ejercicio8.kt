package com.dam1.EjerciciosBasicos.ejercicioU3.diccionarios

fun crearDiccionario(): MutableMap<String, String> {
    print("Ingrese las palabras en formato 'español:inglés' separadas por comas: ")
    val entrada = readLine()?.trim()
    val pares = entrada?.split(",") ?: listOf()
    val diccionario = mutableMapOf<String, String>()

    for (par in pares) {
        try {
            val (espanol, ingles) = par.split(":").map { it.trim() }
            diccionario[espanol] = ingles
        } catch (e: Exception) {
            println("Formato incorrecto en el par: '$par'. Asegúrese de usar 'palabra:traducción'.")
        }
    }

    return diccionario
}

fun traducirFrase(diccionario: Map<String, String>): String {
    print("Ingrese una frase en español: ")
    val frase = readLine()?.trim()
    val palabras = frase?.split(" ") ?: listOf()
    val traduccion = mutableListOf<String>()

    for (palabra in palabras) {
        traduccion.add(diccionario[palabra] ?: palabra)
    }

    return traduccion.joinToString(" ")
}

fun main() {
    println("Bienvenido al traductor español-inglés.")
    val diccionario = crearDiccionario()

    println("\nDiccionario creado:")
    for ((espanol, ingles) in diccionario) {
        println("$espanol: $ingles")
    }

    println("\nAhora traduciremos frases.")
    val traduccion = traducirFrase(diccionario)
    println("\nTraducción:")
    println(traduccion)
}
