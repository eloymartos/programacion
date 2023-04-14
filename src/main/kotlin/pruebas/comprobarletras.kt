package pruebas

fun main(){
    var contador = 0
    var lista = mutableListOf<String>()
    while (true){
        println("$contador = ${contador.toChar()}")
        if (contador.toChar().toString() in lista){
            println("el limite es $contador, letra ${contador.toChar().toString()}")
            break
        }
        lista.add(contador.toChar().toString())
        contador ++

    }
}