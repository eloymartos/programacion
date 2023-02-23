package Vehículos

abstract class VehiculoCarga(nmatricula : String, duracionA:Int,tara:Int):Vehiculo(nmatricula, duracionA) {

    var tara = 0
        get() = field
        set(value) {
            field = if(value <=1) 1 else value
        }

    init {
        this.tara = tara
    }

    override fun alquiler(): Double {
        return (50*duracion + 20*tara).toDouble()
    }

}