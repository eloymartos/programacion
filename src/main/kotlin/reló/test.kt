package reló

fun main(){
    val relohito = Reloj()
    relohito.setTime(18,35,23)
    for (i in 1..1000) {
        relohito.ticTac()
        println(relohito.display())
    }
}
