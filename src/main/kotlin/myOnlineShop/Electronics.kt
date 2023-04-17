package myOnlineShop

abstract class Electronics(price:Double ,manufac : String):Product(price) {

    protected var manufacturer = ""

    override fun mostrar(): String {
        return super.mostrar() + "\nManufac = $manufacturer"
    }

    init{
        manufacturer = manufac
    }

}