fun main(){
    var sumacues = 0.0
    var sumaex = 0.0
    for (i in (1..100)){
        println("cuestionario")
        sumacues += readln().toDouble()
        println("examen")
        sumaex += readln().toDouble()
        println("$i")
        println("la media es ${(sumacues*.3 + sumaex*.7) /i}")
    }
}