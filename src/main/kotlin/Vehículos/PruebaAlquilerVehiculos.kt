package Vehículos

import java.io.*

fun main(){
    var numero = 0
    do {
        print("vehiculos a introducir : ")
        numero = readln().toInt()
    }while (numero <=0)
    val alquiler = Alquiler(numero)
    var archivo = File("data/guardado")
    archivo.writeText(alquiler.importeTotal())
}