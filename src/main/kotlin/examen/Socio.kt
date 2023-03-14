package examen

open class Socio(nombre:String, edad:Int):Persona(nombre, edad) {

    companion object{
        private var actividadesPosibles = mutableMapOf(1 to "karate", 2 to "spinning", 3 to "otra")
    }

    fun anadirActividad(actividad:String){
        var numero = (1..100000).random()
        while (numero in actividadesPosibles){
            numero = (1..100000).random()
        }
        actividadesPosibles[numero]=actividad
    }

    fun accesoActividades():MutableMap<Int, String>{
        return actividadesPosibles
    }

    override fun balanceMensual(): Int {
        return if (edad <18) 20 else 35
    }

    override fun toString(): String {
        return "socio\nnombre = $nombre\nedad = $edad\nbalance mensual = ${balanceMensual()}"
    }

}