package Vehículos

class Alquiler(nvehiculos:Int) {

    private var listado = mutableListOf<Vehiculo>()

    private var nvehiculos = 0

    private val nombreEmpresa = "Vehiculos martos"

    init {
        this.nvehiculos = nvehiculos
        for (i in 1..nvehiculos){
            var tipo = 0
            do{
                println("tipo de vehículo? :\nCoche : 1\nBus : 2\nCamion : 3\nFurgoneta : 4")
                tipo = readln().toInt()
            }while (tipo !in arrayOf(1,2,3,4))
            when (tipo){
                1->{
                    println("primer valor = duracción, segundo matricula, tercero plazas")
                    listado.add(Coche(readln(), readln().toInt(), readln().toInt()))
                }
                2->{
                    println("primer valor = duracción, segundo matricula, tercero plazas")
                    listado.add(Bus(readln(), readln().toInt(), readln().toInt()))
                }
                3->{
                    println("primer valor = duracción, segundo matricula, tercero tara")
                    listado.add(Camion(readln(), readln().toInt(), readln().toInt()))
                }
                4->{
                    println("primer valor = duracción, segundo matricula, tercero tara")
                    listado.add(Furgoneta(readln(), readln().toInt(), readln().toInt()))
                }
            }
        }
    }

    fun importeTotal(){
        var suma = 0.0
        for (i in listado){
            suma += i.alquiler()
        }
        println("Total alquiler: $suma €\n-------------\nDETALLE")
        for (i in listado.indices){
            println(importe((i)))
        }

    }

    private fun importe(pos:Int):String{
        return "-------------\nVEHÍCULO ${pos+1}\n${listado[pos].recibo()}"
    }

}