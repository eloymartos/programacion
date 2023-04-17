package pruebas

import java.io.File

fun main(){
    val lector = File("data/spanish.lst").bufferedReader().readLines()
    print("archivo a intentar descifrar : ")
    var leido = File(readln())
    while (!leido.exists()){
        println("error, escribe de nuevo")
        leido = File(readln())
    }

    var leidocomodin = leido.bufferedReader().readLines()

    var clave = 0
    var encontrado = false

    for (linea in lector){
        println(linea)
        for (suma in -300..300){
            var comodin =""

            for (letra in linea){
                comodin += (letra.code+suma).toChar().toString()
            }

            for (lineaAnalisis in leidocomodin){
                if (comodin in lineaAnalisis){
                    println("!!!!!")
                    encontrado = true
                    clave = suma
                    break
                }
            }
            if (encontrado) break
        }
        if (encontrado) break
    }
    if (encontrado){
        println("se ha encontrado el patron, es $clave")
        for (linea in leidocomodin){
            var estalinea = ""
            for (caracter in linea){
                estalinea += (caracter.code-clave).toChar().toString()
            }
            println(estalinea)
        }
    }else println("no encontrado :(")
}