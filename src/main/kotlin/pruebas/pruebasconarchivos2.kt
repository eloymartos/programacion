package pruebas

import java.io.File

fun main(args: Array<String>) {


    val temp = File("/Users/eloy/Desktop/clase/programacion/tema_4/Kotlin/data/")


    val fotos = File("C:/prueba/Fotos")


    val document = File("C:/prueba/Documento.txt")


    println(temp.absolutePath + " ¿existe? " + temp.exists())


    mostrarEstado(fotos)


    mostrarEstado(document)


    mostrarEstado(temp )


}


fun mostrarEstado(f: File) {


    println(f.absolutePath + " ¿archivo? " + f.isFile)


    println(f.absolutePath + " ¿carpeta? " + f.isDirectory)


}
