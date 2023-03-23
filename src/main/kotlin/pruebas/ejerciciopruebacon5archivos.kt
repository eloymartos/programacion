package pruebas

import java.io.File
import java.util.*

fun main(){
    val archivo1 = File("data/correo.odt")
    val archivo2 = File("data/calculadore de ip.ods")
    val archivo3 = File("data/XD.webm")
    var archivo4 = File("data/1.txt")
    var archivo5 = File("data/proyecto pokemon.rar")
    val lista = mutableListOf(archivo1, archivo2, archivo3, archivo4, archivo5)
    for (i in lista.sortedWith(compareByDescending { it.length() }) ) println("$i = ${i.length()}")
    println("")
    for (i in lista.sortedWith(compareByDescending { it.lastModified() }) ) println("$i = ${Date(i.lastModified())}")
}
