package Poligonos

import kotlin.math.PI

class Circulo:Figura() {

    var radio = 0.0
        set(value) {
            radio = if (value<0) readln().toDouble() else value
        }

    fun obtenerDiametro():Double{
        return radio*2
    }

    override fun area(): Double {
        return radio*radio* PI
    }

    override fun perimetro(): Double {
        return obtenerDiametro()* PI
    }
}