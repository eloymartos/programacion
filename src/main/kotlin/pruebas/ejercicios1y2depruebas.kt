package Vehículos

import java.io.File

fun main(){

    val listacadenas : List<String> = File("data/texto.txt").bufferedReader().readLines()

    val palabra = "la"

    var contador = 0
    for (i in listacadenas){
        println(i)
        for (x in i.split(" ",",")){
            if (x == palabra) contador ++
        }
    }
    println("el contador de veces que se ha escrito \"$palabra\" es de $contador veces")
}