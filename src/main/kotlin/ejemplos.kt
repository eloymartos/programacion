fun main(){
    print ("cuantos numeros decimales quieres")
    var lista1 = DoubleArray(readln().toInt())
    for (i in lista1.indices){
        print ("pon un numero")
        var valor = readln().toDouble()
        lista1 [i] = valor
    }
    for (i in lista1) println (i)
}