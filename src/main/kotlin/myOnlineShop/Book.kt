package myOnlineShop

class Book(price : Double, publisher:String, year:Int):Product(price) {

    private var publisher = ""

    private var yearPublished = 0

    init {
        this.publisher = publisher
        this.yearPublished = year
    }

    override fun computeSpecialCustomerPrice(): Double {
        return computerSalePrice()-2
    }

    override fun computerSalePrice(): Double {
        return regularPrice*.5
    }
}