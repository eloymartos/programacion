package restaurante

class MenuInfantil(Primero : String, Segundo : Int, Tercero : Int, Cuarto : String):Menu() {
    var regalo:String = ""
        set(value) {
            if (value !in arrayOf("muñeca", "soldado")) {
                println("error")
                regalo = readln()
            }else field = value
        }

    init {
        principal = Primero
        bebida = Segundo
        postre = Tercero
        regalo = Cuarto
        super.equivalentesBebida= mapOf(1 to "Refresco", 2 to "Zumo", 3 to "Otros")
    }

    constructor():
            this("", 0, 0, "muñeca")

    override fun importe(): Float {
        return (12).toFloat()
    }

    override fun mostrar(): String {
        return "${super.mostrar()} y $regalo de regalo"
    }
}