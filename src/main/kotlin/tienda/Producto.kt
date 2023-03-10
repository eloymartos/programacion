package tienda

abstract class Producto(nombre:String, precio:Double) {

    private var nombre = ""

    private var precio = 0.0

    init {
        this.nombre = nombre
        this.precio = precio
    }

    open fun calcular(cantidad : Int):Double{
        return precio * cantidad
    }

}