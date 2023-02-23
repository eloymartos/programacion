package myOnlineShop

class Mp3Player(price:Double ,manufac : String, color : String):Electronics(price ,manufac) {

    private var color = ""

    init {
        this.color = color
    }

    override fun computeSpecialCustomerPrice(): Double {
        return computerSalePrice()-15
    }

    override fun computerSalePrice():Double {
        return regularPrice *.9
    }

}