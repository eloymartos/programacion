package pruebas

import java.io.File

fun main() {
    val lector = File("data/spanish.lst").bufferedReader().readLines()
    print("archivo a intentar descifrar : ")
    var leido = File(readln())
    while (!leido.exists()) {
        println("error, escribe de nuevo")
        leido = File(readln())
    }

    var leidocomodin = leido.bufferedReader().readLines()

    var clave = 0
    var encontrado = false

    for (palabra in lector) {



    }
}