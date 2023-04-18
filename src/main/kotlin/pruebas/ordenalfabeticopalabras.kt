package pruebas

import java.io.File

fun main() {

    println("que opcion quieres ?\n1 = ordenar por palabras\n2 = ordenar por linea\n3 = ordenar con separador")
    var respuesta = readln().toInt()
    while (respuesta !in arrayOf(1,2,3)){
        println("error, valor no valido")
        respuesta = readln().toInt()
    }
    when(respuesta){
        1-> opcion1()
        2-> opcion2()
        3-> opcion3()
    }
}

fun opcion1(){
    println("introduce la ruta del archivo : ")
    var archivo = File(readln())

    while (!archivo.exists()) {
        println("error, no existe, intenta de nuevo =")
        archivo = File(readln())
    }

    var lista = mutableListOf<String>()
    for (linea in archivo.bufferedReader().readLines()) {
        for (palabra in linea.split(" ", ",", ".", "-")) {
            lista.add(palabra)
        }
    }
    lista.sort()
    println(lista)
    var cadena = ""
    var escritor = File("data/prueba.txt").bufferedWriter()
    for (i in lista){
        cadena += "$i\n"
    }
    escritor.append(cadena)
    escritor.close()

    """File("data/prueba.txt").printWriter().use {out->
        for (i in lista) out.println(i)
    }"""
}

fun opcion2(){
    println("introduce la ruta del archivo : ")
    var archivo = File(readln())

    while (!archivo.exists()) {
        println("error, no existe, intenta de nuevo =")
        archivo = File(readln())
    }

    var lista = mutableListOf<String>()

    for (i in archivo.bufferedReader().readLines()){
        lista.add(i)
    }
    lista.sort()
    var cadena = ""
    var escritor = File("data/prueba.txt").bufferedWriter()
    for (i in lista){
        cadena += "$i\n"
    }
    escritor.append(cadena)
    escritor.close()
}

fun opcion3(){

    println("introduce la ruta del archivo : ")
    var archivo = File(readln())

    while (!archivo.exists()) {
        println("error, no existe, intenta de nuevo =")
        archivo = File(readln())
    }

    println("cual es el separador ?")
    val separador = readln()
    println("respecto a que columna quieres ordenar ? (empezando por la 1)")
    val columna = readln().toInt()

    var mapa = mutableMapOf<String, String>()

    for (linea in archivo.bufferedReader().readLines()){
        mapa[linea.split(separador)[columna-1]] = linea
    }

    var cadena = ""
    mapa.toSortedMap()
    for (i in mapa.values){
        cadena += "$i\n"
    }
    var escritor = File("data/resultado3.txt").bufferedWriter()
    escritor.append(cadena)
    escritor.close()
}