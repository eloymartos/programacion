package restaurante

open class Menu(Primero : String, Segundo : Int, Tercero : Int) {
    private val IVA = 0.21
    private var descuento = .15
    var principal : String = ""
        set(value) {
            field = if (value !in arrayOf("Entrecot", "Pez Espada", "Carrilada", "Dorada")) "Otros" else value
        }
    private val preciosPrimero = mapOf("Entrecot" to 15.0, "Pez Espada" to 12.0, "Carrillada" to 10.0, "Dorada" to 20.0, "Otros" to 13.0)
    var bebida : Int = 0
        set(value) {
            field = if (value !in arrayOf(1,2)) 3 else value
        }
    var equivalentesBebida = mapOf(1 to "Refresco", 2 to "Vino", 3 to "Otros")
    private val preciosBebida = mapOf(1 to 1.0, 2 to 1.5, 3 to 2.0)
    var postre : Int = 0
        set(value) {
            field = if (value !in arrayOf(1,2)) 3 else value
        }
    private val equivalentesPostres = mapOf(1 to "Fruta", 2 to "Helado", 3 to "Otros")
    private val preciosPostre = mapOf(1 to 2.0, 2 to 3.0, 3 to 4.0)


    init {
        principal = Primero
        bebida = Segundo
        postre = Tercero
    }

    constructor(): this("",0,0)

    open fun importe():Float{
        var suma = 0.0
        suma += preciosPrimero[principal]!!.toDouble() + preciosBebida[bebida]!!.toDouble() + preciosPostre[postre]!!.toDouble()
        suma += (suma*IVA)
        return (suma - (suma*descuento)).toFloat()
    }

    open fun mostrar():String{
        return "El menú consta de $principal, ${equivalentesBebida[bebida]} de beber , y ${equivalentesPostres[postre]} de postre"
    }

}