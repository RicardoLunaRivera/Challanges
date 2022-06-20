package com.example.challenges

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

fun main(){
    var num0: Long=0
    var num1: Long=1

    (1..50).forEach{ _ ->
        println(num0)
        val fibonacci = num0 + num1
        num0 = num1
        num1 = fibonacci
    }

}