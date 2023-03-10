package almacen

import Bebida

class BebidaCantidad(bebida:Bebida, cantidad : Int):Bebida(bebida.litros, bebida.precio, bebida.marca) {

    val tipo = bebida

    val cant = cantidad

}