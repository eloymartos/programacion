package almacen_patricio

import ALMACEN.Agua_mineral
import ALMACEN.Bebida_azucarada

fun main(args:Array<String>){
    var consumicion = when(args[0]){
        "BebidaAzucarada"->{ Bebida_azucarada(args[1].toDouble(), args[2].toDouble(), args[3], args[4].toInt(), args[5].toInt(), args[6].toBoolean())
        }
        "Mineral"->{ Agua_mineral(args[1].toDouble(),args[2].toDouble(), args[3],args[4].toInt(), args[5])
        }
        else->{"error"}
    }
    println(consumicion.toString())
}