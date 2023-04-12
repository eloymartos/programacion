package pruebas

import java.io.File

fun main(){

    var archivo1 = File("data/ejemplo.txt").bufferedReader().readLines()
    var archivo2 = File("data/texto.txt").bufferedReader().readLines()

    var contador = 0

    while (archivo1.size-1 > contador || archivo2.size-1>contador){
        if (archivo1.size-1>contador) println(archivo1[contador])
        if (archivo2.size-1>contador) println(archivo2[contador])

        contador ++
    }
}