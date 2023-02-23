package Vehículos

class Bus(nmatricula : String, duracionA:Int, nplazas:Int):VehiculoTransporte(nplazas, nmatricula, duracionA) {

    override fun recibo(): String {
        return "---------\nBUS\n---------\ndias de alquiler = $duracion\nnº plazas = $nplazas\ntotal = ${alquiler()+2*nplazas}"
    }


}