package myOnlineShop

class TV(price:Double ,manufac : String, size : Int):Electronics(price ,manufac) {

    private var size = 0

    init {
        this.size = size
    }

    override fun mostrar(): String {
        return super.mostrar() + "\nSize = $size\n----------------"
    }
    override fun computeSpecialCustomerPrice(): Double {
        return computerSalePrice()-100
    }

    override fun computerSalePrice(): Double {
        return regularPrice*.8
    }

}