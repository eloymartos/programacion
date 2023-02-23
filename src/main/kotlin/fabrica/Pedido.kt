package fabrica

class Pedido() {
    var producto1 = Producto()
        get() = field
        set(value){
            field = value
        }

    var producto2 = Producto()
        get() = field
        set(value){
            field = value
        }

    var producto3 = Producto()
        get() = field
        set(value){
            field = value
        }

    fun pedirProducto(numero:Int){
        var copia = numero
        while (copia !in arrayOf(1,2,3)){
            print("numero erróneo, introduce otro : ")
            copia = readln().toInt()
        }

        print("introduce nombre : ")
        val nombre = readln()
        print("introduce precio : ")
        val precio = readln().toDouble()

        when(copia){
            1->producto1 = Producto(nombre, precio)
            2->producto2 = Producto(nombre, precio)
            3->producto3 = Producto(nombre, precio)
        }
    }

    fun total():Double{
        return (producto1.precio + producto2.precio + producto3.precio)
    }

    fun mostrarPedido(){
        producto1.resumen()
        producto2.resumen()
        producto3.resumen()
        println("el total es de ${total()}")

    }
}
fun main(){
    val este_pedido = Pedido()
    este_pedido.pedirProducto(1)
    este_pedido.pedirProducto(2)
    este_pedido.pedirProducto(3)
    este_pedido.mostrarPedido()
}