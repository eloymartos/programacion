fun main(){
    var prueba = rectangulo(10, 5)
    var copia = rectangulo(prueba)
    copia.area()
    copia.perimetro()
    print(copia.toString())
}