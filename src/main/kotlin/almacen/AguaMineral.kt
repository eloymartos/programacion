package almacen

class AguaMineral(id : Int, lit : Double, pre : Double, mar : String, manantialOrigen:String):Bebida(id, lit, pre, mar) {
    var manantial = manantialOrigen

    override fun calcular(cantidad: Int): Double {
        return cantidad * precio
    }
}