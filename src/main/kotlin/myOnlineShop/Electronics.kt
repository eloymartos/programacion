package myOnlineShop

abstract class Electronics(price:Double ,manufac : String):Product(price) {

    private var manufacturer = ""

    init{
        manufacturer = manufac
    }

}