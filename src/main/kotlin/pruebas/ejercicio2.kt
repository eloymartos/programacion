package pruebas

import java.io.*

fun main(){
    var cadenat =""
    val lista1 = File("data/texto.txt").bufferedReader().readLines()
    val lista2 = File("data/ejemplo.txt").bufferedReader().readLines()
    for (i in lista1) cadenat +=("$i\n")
    for (i in lista2) cadenat +=("$i\n")
    val escritor = PrintWriter(File("data/ejemplo2.txt"))
    escritor.append(cadenat)
    escritor.close()
}