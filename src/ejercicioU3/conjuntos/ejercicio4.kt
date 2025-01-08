package com.dam1.EjerciciosBasicos.ejercicioU3.conjuntos

fun encontrarFrutasComunes(setFrutas1: Set<String>, setFrutas2: Set<String>): Set<String> {
    return setFrutas1.intersect(setFrutas2)
}

fun encontrarFrutasSoloEnPrimero(setFrutas1: Set<String>, setFrutas2: Set<String>): Set<String> {
    return setFrutas1.subtract(setFrutas2)
}

fun main() {
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    val frutasComunes = encontrarFrutasComunes(setFrutas1, setFrutas2)
    val frutasSoloEnFrutas1 = encontrarFrutasSoloEnPrimero(setFrutas1, setFrutas2)
    val frutasSoloEnFrutas2 = encontrarFrutasSoloEnPrimero(setFrutas2, setFrutas1)

    println("Frutas en ambas listas: $frutasComunes")
    println("Frutas solo en frutas1: $frutasSoloEnFrutas1")
    println("Frutas solo en frutas2: $frutasSoloEnFrutas2")
}
