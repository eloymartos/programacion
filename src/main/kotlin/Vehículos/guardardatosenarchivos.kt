package Vehículos

import java.io.File

fun main(){

    var archivo = File("/data/guardado2")

    archivo.writeBytes(ByteArray(1,))

}