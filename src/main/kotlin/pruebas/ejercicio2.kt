package pruebas

import java.io.*

fun main(){
    var cadena =""
    val lista1 = File("data/texto.txt").bufferedReader().readLines()
    val lista2 = File("data/ejemplo.txt").bufferedReader().readLines()
    //File("data/ejemplo2.txt").printWriter().use{out->
    //    for (i in lista1) out.println(i)
    //    for (i in lista2) out.println(i)
    //}
    for (i in lista1) cadena +=("$i\n")
    for (i in lista2) cadena +=("$i\n")
    val escritor = PrintWriter(File("data/ejemplo2.txt"))
    escritor.append(cadena)
    escritor.close()
}