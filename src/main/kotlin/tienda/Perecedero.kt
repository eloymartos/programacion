package tienda

class Perecedero(nombre : String, precio : Double, diasParaCaducar : Int):Producto(nombre, precio) {

    var caducidad = 0

    init {
        caducidad = diasParaCaducar
    }

    override fun calcular(cantidad: Int): Double {
        if (caducidad == 1) return super.calcular(cantidad) * .25
        if (caducidad == 2) return super.calcular(cantidad) * .33
        if (caducidad == 3) return super.calcular(cantidad) * .5
        return super.calcular(cantidad)
    }

}