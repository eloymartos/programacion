package Vehículos

class Camion(nmatricula : String, duracionA:Int,tara:Int):VehiculoCarga(nmatricula, duracionA, tara)  {

    override fun recibo(): String {
        return "---------\nCAMION\n---------\ndias de alquiler = $duracion\nnº tara = $tara\ntotal = ${alquiler()}"
    }

    override fun alquiler(): Double {
        return super.alquiler()+ 40
    }

}