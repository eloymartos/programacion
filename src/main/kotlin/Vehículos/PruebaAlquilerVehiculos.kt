package Vehículos

fun main(){
    var numero = 0
    do {
        print("vehiculos a introducir : ")
        numero = readln().toInt()
    }while (numero <=0)
    val alquiler = Alquiler(numero)

    alquiler.importeTotal()
}