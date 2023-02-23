package Vehículos

class Furgoneta(nmatricula : String, duracionA:Int,tara:Int):VehiculoCarga(nmatricula, duracionA, tara) {

    override fun recibo(): String {
        return "---------\nFURGONETA\n---------\ndias de alquiler = $duracion\nnº tara = $tara\ntotal = ${alquiler()}"
    }

}