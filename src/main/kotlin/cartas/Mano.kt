class Mano(baraja: Baraja){
    var cartas = mutableListOf<Carta>()
        get() = field

    var numero_cartas = 3
        get() = field

    init {
        cartas.add(baraja.sacar_carta())
        cartas.add(baraja.sacar_carta())
        cartas.add(baraja.sacar_carta())
    }

    fun pedirCarta(baraja: Baraja){
        cartas.add(baraja.sacar_carta())
        numero_cartas = cartas.size
    }

    fun ganador(otra_mano: Mano) {
        var suma1 = 0
        var suma2 = 0
        for (i in cartas.indices) {
            suma1 += cartas[i].numero
            suma2 += otra_mano.cartas[i].numero
        }
        if (suma1 > suma2) {
            println("gana jugador 1")
        } else if (suma2 > suma1) {
            println("gana jugador 2")
        } else {
            suma1 = 0
            suma2 = 0
            for (i in cartas.indices) {
                if (cartas[i].palo in arrayOf("c", "r")) suma1 += 1
                if (otra_mano.cartas[i].palo in arrayOf("c", "r")) suma2 += 1
            }
            if (suma1 > suma2) {
                println("gana jugador 1")
            } else if (suma2 > suma1) {
                println("gana jugador 2")
            } else println("empate, ${mostrar_mano()}, ${otra_mano.mostrar_mano()}")
        }
    }

    fun mostrar_mano(){
        for (i in cartas) println(i.mostrarCarta())
    }

    fun mostrar_esta_carta(numero: Int){
        if (numero in cartas.indices){
            println(cartas[numero].mostrarCarta())
        }else println("esta mano no tiene tantas cartas")
    }

    fun actualizar_carta(numero: Int, carta: Carta){
        if (numero in cartas.indices) cartas[numero] = carta else println("numero erróneo")
    }

    override fun toString(): String {
        return cartas[0].mostrarCarta()
    }
}