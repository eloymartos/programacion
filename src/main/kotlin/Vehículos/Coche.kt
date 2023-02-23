package Vehículos

class Coche(nmatricula : String, duracionA:Int, nplazas:Int):VehiculoTransporte(nplazas, nmatricula, duracionA) {

    override fun recibo(): String {
        return "---------\nCOCHE\n---------\ndias de alquiler = $duracion\nnº plazas = $nplazas\ntotal = ${alquiler()}"
    }
}