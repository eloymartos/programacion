package Poligonos

abstract class Poligono:Figura() {
    var nLados = 0.0
    var apotema = 0.0

    override fun area(): Double {
        return (apotema* perimetro()/2)
    }

    override fun perimetro(): Double {
        return nLados*apotema
    }
}