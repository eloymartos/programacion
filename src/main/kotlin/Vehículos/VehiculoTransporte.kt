package Vehículos

abstract class VehiculoTransporte(nplazas:Int, nmatricula:String, duracionA : Int):Vehiculo(nmatricula, duracionA) {

    var nplazas = 0
        get() = field
        set(value) {
            field = if (value <= 1) 1 else value
        }

    init {
        this.nplazas = nplazas
    }

    override fun alquiler(): Double {
        return 50*duracion + 1.5*nplazas
    }

}