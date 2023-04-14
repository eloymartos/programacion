package pruebas

import java.io.File

fun main(){
    var lectura = ""
    println("imprime el archivo a descifrar")
    lectura = readln()
    while (!File(lectura).exists()){
        println("tas equivocao amigo")
        lectura = readln()
    }
    println("introduce la clave")
    val clave = readln().toInt()
    var resultado = ""
    for (i in File(lectura).bufferedReader().readLines()){
        for(x in i){
            resultado += (x.toByte()-clave).toChar().toString()
        }
        resultado+= "\n"
    }
    println(resultado)
}