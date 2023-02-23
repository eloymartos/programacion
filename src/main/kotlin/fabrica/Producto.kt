package fabrica

class Producto(nombre_or:String,precio_or:Double) {
    var nombre = "a"
        get() = field
        set(valor){
            var comparador = valor
            while (comparador.length == 0){
                print("valor vacío en nombre, introduzca nombre : ")
                comparador = readln()
            }
            field = comparador
        }

    var serie = 0
        get() = field
        set(valor){
            field = generar()
        }

    var precio = 0.0
        get() = field
        set(valor){
            var comparador = valor
            while (comparador < 0){
                print("valor incorrecto para precio, introduzca de nuevo : ")
                comparador = readln().toDouble()
            }
            field = comparador
        }

    init {
        nombre = nombre_or
        serie = generar()
        precio = precio_or
    }

    constructor():
            this("a", 0.0)

    fun generar():Int{
        val valor = (1..100000).random()
        return valor
    }

    fun pedirNombre(){
        print("introduce nombre : ")
        nombre = readln()
    }

    fun pedirPrecio(){
        print("introduce precio : ")
        precio = readln().toDouble()
    }

    fun resumen(){
        println("INFORME DEL PRODUCTO\n---------------------------\n$nombre\n$serie\n$precio\n")
    }

    fun iguales(producto: Producto):Boolean{
        if (nombre == producto.nombre && serie == producto.serie) return true
        return false
    }
}
