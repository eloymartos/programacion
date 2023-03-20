package myOnlineShop


fun main(args:Array<String>) {
    val listado = mutableListOf<Product>()
    //TV 1250.0 HiSens 45 TV 1000.0 Samsung 30 Mp3Player 250.0 Apple blue Camera 500.0 Sony Book 15.0 "Korea press" 1986
    for (i in args.indices) {
        println(args[i])
        if (args[i] == "Book"){
            listado.add(Book(args[(i+1)].toDouble(), args[i+2], args[i+3].toInt()))
            println("libro")
        }
        if (args[i] == "TV"){
            listado.add(TV(args[i+1].toDouble(), args[i+2], args[i+3].toInt()))
            println("tele")
        }
        if (args[i] == "Camera"){
            listado.add(Camera(args[i+1].toDouble(), args[i+2]))
            println("camara")
        }
        if (args[i] == "Mp3Player"){
            listado.add(Camera(args[i+1].toDouble(), args[i+2]))
            println("emepetres")
        }
    }
    //val objeto = TV(1250.0, "HiSense", 45)
    //listado.add(TV(1000.0, "Samsung", 30))
    //listado.add(TV(2000.0, "Sony", 50))
    //listado.add(Mp3Player(250.0, "Apple", "blue"))
    //listado.add(Book(34, "Sun press", 1992))
    //listado.add(Book(15, "Korea press", 1986))
    //listado.add(Camera(500.0, "Sony"))
    //listado.add(Camera(700.0, "logitech"))
    //listado.add(objeto)
    for (i in listado){
        println("objeto ${i.numeroSerie} = \ntipo = ${i.javaClass.name}\nregular price = ${i.regularPrice}\nsale price = ${i.computerSalePrice()}\nSpecial Customer Price = ${i.computeSpecialCustomerPrice()}\n------------------")
    }
    println(Product.contador)

}