package pruebaLinea

fun main(){
    var linea1 = Line(1.4,4.2,6.2,5.2)
    var linea2 = Line(5.1, 7.5,9.3,5.7)

    if (linea2.isEqual(linea1)) println("son iguales") else println("no son iguales")
    if(linea2.isLess(linea1)) println("2 es menor") else println("2 no es menor")
    if(linea2.isGreater(linea1)) println("2 es mayor") else println("2 no es mayor")

    if(linea2.isGreater(3)) println("2 es mayor") else println("2 no es mayor")

}