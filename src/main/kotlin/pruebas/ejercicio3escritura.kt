package pruebas

import java.io.File

fun main(){
    println("escribe la ruta del archivo de origen")
    var lectura = readln()
    while (!File(lectura).exists()){
        println("error, escribe de nuevo")
        lectura = readln()
    }
    var origen = File(lectura).bufferedReader().readLines()
    println("escribe la ruta del archivo destino")
    var lector = File(readln()).writer()
    println("escribe la clave")
    val clave = readln().toInt()
    for (i in origen){
        var cadenatransicion = ""
        for (x in i){
            cadenatransicion+=(x.code+clave).toChar().toString()
        }
        lector.append(cadenatransicion)
        lector.append("\n")
    }
}