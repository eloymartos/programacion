class Baraja() {
    val baraja = mutableListOf<Carta>()
        get(){
            return field
        }

    init {
        val opciones = arrayOf<String>("c", "r", "t", "p")
        for (i in opciones){
            for (x in (1..13)){
                baraja.add(Carta(x, i))
            }
        }
    }

    fun sacar_carta():Carta{
        val sacada = baraja.random()
        baraja.remove(sacada)
        println("has sacado ${sacada.mostrarCarta()}")
        return sacada
    }

}