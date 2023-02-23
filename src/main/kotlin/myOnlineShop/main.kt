package myOnlineShop

fun main() {

    val listado = mutableListOf<Product>()
    val objeto = TV(1250.0, "HiSense", 45)
    listado.add(TV(1000.0, "Samsung", 30))
    listado.add(TV(2000.0, "Sony", 50))
    listado.add(Mp3Player(250.0, "Apple", "blue"))
    listado.add(Book(34.0, "Sun press", 1992))
    listado.add(Book(15.0, "Korea press", 1986))
    listado.add(Camera(500.0, "Sony"))
    listado.add(Camera(700.0, "logitech"))
    listado.add(objeto)
    for (i in listado){
        println("objeto ${i.numeroSerie} = \ntipo = ${i.javaClass.name}\nregular price = ${i.regularPrice}\nsale price = ${i.computerSalePrice()}\nSpecial Customer Price = ${i.computeSpecialCustomerPrice()}\n------------------")
    }
    println(Product.contador)

}