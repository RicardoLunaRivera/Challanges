package com.example.challenges
/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 *
 */
fun main() {

    //Probamos la funcion siendo anagrama
    println(isAnagrama(String1 ="Amor", String2 = "mora"))
    //Probamos la funcion sinedo la misma palabra
    println(isAnagrama(String1="Amor", String2 ="Amor"))
    //Probramos otro anagrama
    println(isAnagrama(String1 ="Roma", String2="Amor" ))
    //probamos con un palabras diferentes
    println(isAnagrama(String1="Amor", String2="Caballo"))
}
    //Creamos una funcion que compruebe si son un anagrama
  private fun isAnagrama(String1 : String, String2: String) :Boolean{
        //comprobamos primero que no sea la misma palabra
        if(String1.lowercase()==String2.lowercase()){
            return false
        }
        /*
        la primer palabra se pasa a minúsculas, se agrega a un array y se ordena
        despues se compara con la segunda palabra (que tiene el mismo tratamiento que la primera
         */
        return String1.lowercase().toCharArray().sortedArray().
        contentEquals(String2.lowercase().toCharArray().sortedArray())
    }

