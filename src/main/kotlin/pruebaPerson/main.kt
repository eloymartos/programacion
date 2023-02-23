package pruebaPerson

fun main(){

    var persona = Person(readln().toInt(), readln().toInt(), readln(), readln())
    println("person wealth = ${persona.computeTotalWealth()}\nperson name = ${persona.getName()}")

}