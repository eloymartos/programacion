package examen

class SocioPlus(nombre : String, edad:Int):Socio(nombre, edad) {

    override fun balanceMensual(): Int {
        return if (edad>18) 60 else 45
    }

    override fun toString(): String {
        var cadena = "socioPlus\nnombre = $nombre\nedad = $edad\nbalance mensual = ${balanceMensual()}\nactividades = "
        for (i in accesoActividades().values) cadena+= "$i "
        return cadena
    }
}