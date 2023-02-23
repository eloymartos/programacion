package myOnlineShop

abstract class Product(regularInitialPrice: Double) {

    var regularPrice: Double
    var IVA = tiposIVA[3]
        set(value) {
            if (value in tiposIVA) field = value
        }
    var numeroSerie = 0

    init {
        regularPrice = regularInitialPrice
        contador += 1
        numeroSerie = contador
    }


    abstract fun computeSpecialCustomerPrice():Double

    abstract fun computerSalePrice():Double

    companion object{
        var contador = 0
        val tiposIVA = arrayOf(0,4,10,21)
    }
}
