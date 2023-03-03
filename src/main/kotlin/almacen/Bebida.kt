package almacen


abstract class Bebida(id : Int, lit : Double, pre : Double, mar : String) {

    var identificador = 0
        set(value) {
            field = if (value !in usados) value else usados.max()+1
        }

    var litros = 0.0

    var precio = 0.0

    var marca = ""

    init {
        identificador = id
        usados.add(identificador)
        litros = lit
        precio = pre
        marca = mar
    }

    constructor(otra : Bebida):this(otra.identificador,otra.litros,otra.precio,otra.marca)

    abstract fun calcular(cantidad : Int):Double

    companion object{
        val usados = mutableListOf<Int>()
    }

}