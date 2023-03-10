package tienda

class NoPerecedero(nombre : String, precio : Double, tipo : String):Producto(nombre, precio) {

    var tipo = ""

    init {
        this.tipo = tipo
    }

}