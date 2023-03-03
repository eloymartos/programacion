package myOnlineShop

abstract class Product(regularInitialPrice: Double):RelationInterface {

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

    override fun isGreater(a: Any): Boolean {
        a as Product
        return if ( a.regularPrice < this.regularPrice) true else false
    }

    override fun isEqual(a: Any): Boolean {
        a as Product
        return if ( a.regularPrice == this.regularPrice) true else false
    }

    override fun isLess(a: Any): Boolean {
        a as Product
        return if ( a.regularPrice > this.regularPrice) true else false
    }

    companion object{
        var contador = 0
        val tiposIVA = arrayOf(0,4,10,21)
    }
}
