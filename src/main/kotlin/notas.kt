fun main() {
    print("introduce tu nota : ")
    val nota = readln().toInt()
    var resultado = ""
    when(nota){
        in 0..4-> resultado = "suspenso"
        5-> resultado = "aprobado"
        6-> resultado = "bien"
        in 7..8-> resultado = "notable"
        in 9..10-> resultado = "sobresaliente"
    }
    print(resultado)
}