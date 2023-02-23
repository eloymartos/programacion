package myOnlineShop


class Camera(price:Double ,manufac : String): Electronics(price ,manufac) {

    override fun computerSalePrice(): Double {
        return regularPrice * .7
    }

    override fun computeSpecialCustomerPrice(): Double {
        return computerSalePrice()-200
    }

}