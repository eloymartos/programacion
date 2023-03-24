package myOnlineShop

fun main(args:Array<String>) {

    val listado = mutableListOf<Product>()
    //TV 1250.0 HiSens 45 TV 1000.0 Samsung 30 Mp3Player 250.0 Apple blue Camera 500.0 Sony Book 15.0 "Korea press" 1986
    for (i in args.indices) {
        buscartipo(listado, i, args)
    }
    while (true){
        print("operaciones a ejecutar:\n" +
                "añadir 1\n" +
                "modificar 2\n" +
                "borrar 3\n" +
                "mostrar 4\n" +
                "salir 5\n")
        var respuesta = readln().toInt()
        while (respuesta !in 1..5){
            println("error")
            respuesta = readln().toInt()
        }
        when (respuesta){
            1->{
                print("que quieres añadir?")
                var respuesta2 = readln()
                while (respuesta2 !in arrayOf("TV", "Mp3Player", "Camera", "Book")){
                    print("que quieres añadir?")
                    respuesta2 = readln()
                }
                if (respuesta2 == "Book"){
                    recibirBook(listado)
                }
                if (respuesta2 == "TV"){
                    recibirTV(listado)
                }
                if (respuesta2 == "Camera"){
                    recibirCamara(listado)
                }
                if (respuesta2 == "Mp3Player"){
                    recibirMp3(listado)
                }
            }
            2->{
                println("numero de seleccion del producto a modificar = ")
                val modificar = readln().toInt()
                println("inserta el nuevo precio")
                encontrar(listado, modificar).regularPrice = readln().toDouble()
            }
            3->{
                println("numero de seleccion del producto a borrar = ")
                val borrar = readln().toInt()
                listado.remove(encontrar(listado, borrar))
            }
            4->{
                println("numero de seleccion del producto a mostrar = ")
                val mostrar = readln().toInt()
                println(encontrar(listado, mostrar).mostrar())
            }
            5->break
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
        println(i.mostrar())
    }
    println(Product.contador)

}


fun recibirBook(listado:MutableList<Product>){
    println("precio, marca, año")
    listado.add(Book(readln().toDouble(), readln(), readln().toInt()))
}
fun recibirTV(listado: MutableList<Product>){
    println("precio, marca, tamaño")
    listado.add(TV(readln().toDouble(), readln(), readln().toInt()))
}
fun recibirMp3(listado: MutableList<Product>){
    println("precio, marca, color")
    listado.add(Mp3Player(readln().toDouble(), readln(), readln()))
}
fun recibirCamara(listado: MutableList<Product>){
    println("precio, marca")
    listado.add(Camera(readln().toDouble(), readln()))
}
fun encontrar(listado: MutableList<Product>, numero:Int): Product {
    val comodin = mutableListOf<Product>()
    for (i in listado) if (i.numeroSerie == numero) {
        comodin.add(i)
    }
    return comodin[0]
}

fun buscartipo(listado: MutableList<Product>, i:Int, args:Array<String>){
    if (args[i] == "Book"){
        listado.add(Book(args[(i+1)].toDouble(), args[i+2], args[i+3].toInt()))
    }
    if (args[i] == "TV"){
        listado.add(TV(args[i+1].toDouble(), args[i+2], args[i+3].toInt()))
    }
    if (args[i] == "Camera"){
        listado.add(Camera(args[i+1].toDouble(), args[i+2]))
    }
    if (args[i] == "Mp3Player"){
        listado.add(Camera(args[i+1].toDouble(), args[i+2]))
    }
}
