class Carta(numero_orig:Int, palo_orig : String) {
    var numero = 0
        get(){
            return field
        }set(valor){
            if (valor in (1..13)) field = valor}
    var palo= ""
        get(){
            return field
        }set(valor){
        if (valor in arrayOf("c", "p", "r", "t")) field = valor}

    init {
        numero = numero_orig
        palo = palo_orig
    }

    constructor(copiada: Carta):
            this(copiada.numero, copiada.palo)

    fun mostrarCarta() : String{
        var mostrar_numero = ""
        val intercambios = mapOf<Int, String>(1 to "as", 11 to "jack", 12 to "reina", 13 to "rey")
        if (intercambios.keys.contains<Int>(numero)){
            mostrar_numero = intercambios[numero].toString()
        } else mostrar_numero = "$numero"
        val intercambios2 = mapOf<String, String>("c" to "corazones", "p" to "picas", "r" to "rombos", "t" to "treboles")
        val mostrar_palo = intercambios2[palo].toString()
        return "el modelo $mostrar_numero de $mostrar_palo "
    }

    fun comparar(carta: Carta){
        if (this.numero > carta.numero) println("gana la primera carta indicada") else if (this.numero < carta.numero){
            println("gana la segunda carta indicada")
        } else if (this.palo > carta.palo) println("vana la primera carta indicada") else if (this.palo < carta.palo){
            println("gana la segunda carta indicada")
        } else println("empate")
    }
}