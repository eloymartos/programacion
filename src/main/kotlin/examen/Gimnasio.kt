package examen

class Gimnasio(nom:String, dir:String) {

    private var nombre = nom

    private var direccion = dir

    private var listaPersonas = mutableListOf<Persona>()

    fun anadirPersona(persona: Persona){
        listaPersonas.add(persona)
    }

    fun balanceTotal():Int{
        var total = 0
        for (i in listaPersonas){
            total +=i.balanceMensual()
        }
        return total
    }

    override fun toString(): String {
        var cadena = ""
        for (i in listaPersonas) cadena += i.toString()+"\n\n"
        cadena += "\nnombre del gimnasio = $nombre\ndireccion = $direccion\nbalance total del gimnasio = ${balanceTotal()}"
        return cadena
    }

}