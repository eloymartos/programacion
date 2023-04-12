package pruebas

import java.io.File

fun main(){
    var cadena :MutableList<String> = mutableListOf()
    while (true){
        println("introduce nombre")
        val valor = readln()
        if (valor == "") break
        cadena.add(valor)
    }
    println(cadena)
    File("data/texto.txt").printWriter().use{out->
        for (i in cadena) out.println(i)
    }
}