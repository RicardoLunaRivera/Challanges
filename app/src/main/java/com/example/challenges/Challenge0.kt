package com.example.challenges
/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21

 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100
 * (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

fun main() {

        for(number in 1..100){
            //verificamos si el numero es multiplo de 3
            var numInThree = number % 3 ==0
            //verificamos si el número es multiplo de 5
            var numInFive = number % 5 == 0

            //Si el número es divisible entre 3 y 5, se imprime FIZZBUZZ
            if(numInThree && numInFive){
                println("fizzbuzz")

             //Si en número es multiplo de 3 imprimimos FIZZ
            }else if (numInThree){
                println("fizz")
             //Si en número es multiplo de 5 imprimimos BUZZ
            }else if (numInFive){
                println("buzz")
             //Si el número no es multiplo de 3 y 5 se imprime
            }else{
                println(number)
            }
    }

}