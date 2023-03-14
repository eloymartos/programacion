package examen

class SocioConActividades(nombre : String, edad : Int, listaactividades:Array<Int>):Socio(nombre, edad) {

    var actividadesPropias = mutableListOf<Int>()

    init {
        var incorrecto = false
        for (i in listaactividades) {
            if (!incorrecto && i !in accesoActividades()){
                incorrecto = true
                actividadesPropias.add(3)
            }else if (i in accesoActividades()) actividadesPropias.add(i)
        }
    }

    constructor(nombre: String, edad: Int):this(nombre, edad, arrayOf(3))

    fun anadirActividadPropia(actividad:String){
        if (actividad in accesoActividades().values) {
            for (i in accesoActividades().keys){
                if (accesoActividades()[i] == actividad) actividadesPropias.add(i)
            }
        }else print("actividad no válida")
    }

    override fun balanceMensual(): Int {
        val cuenta = super.balanceMensual() + actividadesPropias.size*10
        return if (cuenta>40 && edad <18 || cuenta > 60 && edad >18){
            if (edad>18) 60 else 45
        } else cuenta
    }

    override fun toString(): String {
        var cadena = "socio con actividades\nnombre = $nombre\nedad = $edad\nbalance mensual = ${balanceMensual()}\nactividades = "
        for (i in actividadesPropias) cadena += accesoActividades()[i] + " "
        return cadena
    }
}