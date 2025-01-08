package com.dam1.EjerciciosBasicos.ejercicioU3.diccionarios

fun agregarDato(persona: MutableMap<String, String>): Boolean {
    print("Ingrese el tipo de información (por ejemplo, 'nombre', 'edad', 'teléfono'): ")
    val clave = readLine()?.trim()

    if (clave?.lowercase() == "salir") {
        return false
    }

    print("Ingrese el valor para '$clave': ")
    val valor = readLine()?.trim()

    if (clave != null && valor != null) {
        persona[clave] = valor
    }

    return true
}

fun mostrarDiccionario(persona: Map<String, String>) {
    println("\nContenido del diccionario actualizado:")
    for ((k, v) in persona) {
        println("  $k: $v")
    }
    println("-".repeat(40))
}

fun recopilarInformacion(): Map<String, String> {
    val persona = mutableMapOf<String, String>()
    println("Vamos a recopilar información sobre una persona.")
    println("Escribe 'salir' en la clave para finalizar.")

    var continuar = true
    while (continuar) {
        continuar = agregarDato(persona)
        if (continuar) {
            mostrarDiccionario(persona)
        }
    }

    return persona
}

fun main() {
    val datosPersona = recopilarInformacion()
    println("\nInformación recopilada:")
    for ((k, v) in datosPersona) {
        println("$k: $v")
    }
}
