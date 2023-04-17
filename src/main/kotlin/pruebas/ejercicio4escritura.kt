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
    for (linea in File(lectura).bufferedReader().readLines()){
        for(caracter in linea){
            resultado += (caracter.toByte()-clave).toChar().toString()
        }
        resultado+= "\n"
    }
    println(resultado)
}