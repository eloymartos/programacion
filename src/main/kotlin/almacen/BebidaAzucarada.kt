package almacen

class BebidaAzucarada(id : Int, lit : Double, pre : Double, mar : String,pa:Int, pro:String):Bebida(id, lit, pre, mar) {
    var porcentajeAzucar = pa

    var promocion = pro

    override fun calcular(cantidad: Int): Double {
        return cantidad * precio
    }
}