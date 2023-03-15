package pruebas

fun main(){

    val opcion = readln().toInt()

    var nombre : String

    var salario : Double?

    when(opcion){
        1->try{
            nombre = readln()

            salario = readln().toDouble()

        }catch (ex : NumberFormatException){
            error("error")
        }
        2->try{
            nombre = readln()

            salario = readln().toDouble()

        }catch (ex : NumberFormatException){
            println("error , no numerico o nulo")
        }
        3->try{
            nombre = readln()

            salario = readln().toDouble()

        }catch (ex : NumberFormatException){
            println("error , vuelva a introducir")
            salario = readln().toDouble()
        }
        4-> {
            fun leer():Double{
                try{
                println("introduzca numero")
                return readln().toDouble()
                } catch (ex:NumberFormatException){
                    println("error")
                    return leer()
                }
            }
        }
        5->{
            try {

            nombre = readln()

            salario = readln().toDoubleOrNull()

            }catch (ex:NumberFormatException){
                error("error")
            }
        }
        6->{
            try {

                nombre = readln()

                salario = readln().toDoubleOrNull()
                if (salario == null){
                    salario = 0.0
                }

                println("$salario")

            } catch (ex:NumberFormatException){
                error("error")
            }
        }
    }

}