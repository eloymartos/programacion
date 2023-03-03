package almacen

class AguaMineral(id : Int, lit : Double, pre : Double, mar : String, manantOrigen:String):Bebida(id, lit, pre, mar) {
    var manantialOrigen = manantOrigen

    override fun calcular(cantidad: Int): Double {
        return cantidad * precio
    }
}