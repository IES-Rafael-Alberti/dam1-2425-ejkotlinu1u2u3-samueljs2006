package com.dam1.EjerciciosBasicos.ejercicioU3.listasytuplas

fun mostrarMenorYMayor(precios: List<Int>) {
    val menorPrecio = precios.minOrNull()
    val mayorPrecio = precios.maxOrNull()

    if (menorPrecio != null && mayorPrecio != null) {
        println("El menor precio es: $menorPrecio")
        println("El mayor precio es: $mayorPrecio")
    }
}

fun main() {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)
    mostrarMenorYMayor(precios)
}
