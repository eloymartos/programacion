package examen

abstract class Persona(nom:String, ed:Int) {

    protected var nombre:String

    protected var edad=16
        set(value) {
            field = if(value >= 16) value else 16
        }

    init {
        nombre = nom
        edad = ed
    }

    abstract fun balanceMensual():Int

}