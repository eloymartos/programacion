package Vehículos

abstract class Vehiculo(nmatricula : String, duracionA:Int) {
    protected var matricula = ""
        get() = field
        set(value) {field = value}

    protected var duracion = 0
        get() = field
        set(value) {
            field = if(duracion<=0) 1 else value
        }

    init {
        duracion = duracionA
        matricula = nmatricula
    }

    abstract fun alquiler():Double

    abstract fun recibo():String
}