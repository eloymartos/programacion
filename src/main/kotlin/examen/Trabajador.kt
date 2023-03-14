package examen

class Trabajador(nombre:String, edad : Int, sue:Int, ss:Int):Persona(nombre, edad) {

    private var sueldo :Int

    private var seguroSocial:Int

    init {
        sueldo = sue
        seguroSocial = ss
    }

    override fun balanceMensual(): Int {
        return -(sueldo + seguroSocial)
    }

    override fun toString(): String {
        return "trabajador\nnombre = $nombre\nedad = $edad\nsueldo total = ${balanceMensual()}"
    }

}