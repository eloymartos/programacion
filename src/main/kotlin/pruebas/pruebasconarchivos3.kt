package pruebas

import java.util.*

import java.io.File

fun main(args: Array<String>) {




    val documento = File("data/texto.txt")




    println(documento.absolutePath)




    val milisegundos = documento.lastModified()




    val fecha = Date(milisegundos)




    println("Última modificación (ms)   : $milisegundos")




    println("Última modificación (fecha): $fecha")




    println("Tamaño del archivo: " + documento.length())




}
