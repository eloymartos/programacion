package pruebas

import java.io.File
import java.util.*
import kotlin.math.abs

fun main(){
    val archivo1 = File("data/correo.odt")
    val archivo2 = File("data/calculadore de ip.ods")
    val archivo3 = File("data/XD.webm")
    var archivo4 = File("data/1.txt")
    var archivo5 = File("data/proyecto pokemon.rar")
    val lista = mutableListOf(archivo1, archivo2, archivo3, archivo4, archivo5)
    for (i in lista.sortedWith(compareByDescending { it.length() }) ) println("$i = ${i.length()}")
    println("")

    var lista2 = lista.sortedWith(compareByDescending { it.lastModified() })
    var distancia1 = abs(lista2[0].lastModified() - lista2[1].lastModified())
    var guardados = arrayOf(lista2[0], lista2[1])

    for (i in 0..lista2.size-2){
        if (abs(lista2[i].lastModified()-lista2[i+1].lastModified()) < distancia1) {
            distancia1 = lista2[i].lastModified()-lista2[i+1].lastModified()
            guardados[0] = lista2[i]
            guardados[1] = lista2[i+1]
        }
    }
    println("$distancia1, que es la distancia entre ${guardados[0]} y ${guardados[1]}")
}
