import almacen.BebidaCantidad

fun main(args: Array<String>) {


    //vamos a probar los objetos y sus funciones

    //completa
    var agua1=BebidaCantidad(Agua_mineral(2.0,1.0,"bezoya",1,"cazorla"),5)
    //sin identificador
    var agua2=Agua_mineral(1.0,1.0,"fontvella","pepe")
    //dando un identificador que ya existe
    var agua3=Agua_mineral(3.0, 1.0,"fontvella",1,"sierra")

    println(agua1.toString())
    println(agua2.toString())
    println(agua3.toString())

    //completa
    var azucar1=Bebida_azucarada(2.0,1.0,"pepito",4,20,true)
    //sin identificador
    var azucar2=Bebida_azucarada(2.0,1.0,"pepito",20,false)
    //identificador que ya existe
    var azucar3=Bebida_azucarada(2.0,1.0,"mmmm",4,20,true)



    println(azucar1.toString())
    println(azucar2.toString())
    println(azucar3.toString())

    println("Calculo el precio de agua1:")
    println( agua1.calcular_precio(2))
    println("Calculo el precio de azucar2:")
    println(azucar2.calcular_precio(2))
    println("Calculo el precio de azucar3:")
    println(azucar3.calcular_precio(2))

    println()

    //a partir de aquí probamos almacen


    //extra
    var azucar4=Bebida_azucarada(4.0,1.0,"pepito", 4,20,true)
    var azucar5=Bebida_azucarada(4.0,1.0,"sensa", 4,20,true)
    var agua4=Agua_mineral(3.0, 1.0,"bezoya",1,"sierra")

    var estanteria1= mutableListOf<Bebida>(agua1, azucar4)
    var estanteria2= mutableListOf<Bebida>(agua2, agua3, azucar1,azucar2,azucar3)
    var estanteria3= mutableListOf<Bebida>(azucar5)
    var estanteria4= mutableListOf<Bebida>(agua4)

    var almacen1= Almacen(mutableMapOf<Int, MutableList<Bebida>>(1 to estanteria1,
        2 to estanteria2, 3 to estanteria3, 4 to estanteria4))

    println("Veamos primero el almacen:\n")
    println(almacen1.toString())
    println("Vamos a añadir algunas bebidas mediante funciones:")
    //agregar a un estante en concreto
    almacen1.agregar1((Bebida_azucarada(2.0,
        1.0,"macdonals", 20, true)),2)


    //agregar al estante más vacío
    almacen1.agregar2((Bebida_azucarada(2.0,
        1.0,"fanta", 20, true)))

    //al estante con más bebidas de esa marca
    almacen1.agregar3(Agua_mineral(10.0, 1.0,"fontvella",1,"sierra"))

    println("Almacen con las añadidas:\n")
    println(almacen1.toString())

    println("..........................")
    println("Precio de todo el almacen:")
    println(almacen1.calcular_precio_todo_almacen())
    println("Precio de la marca fontvella:")
    println(almacen1.calcular_precio_marca("fontvella"))
    println("precio estantería 3:")
    println(almacen1.calcular_precio_estanteria(3))

    println("...............................")
    println("Vamos a borrar el único producto de la estantería 4\n")
    almacen1.comprar(9)
    println(almacen1.toString())

    println("...............................")
    println("Vaolvemos a pedir los precios\n")
    println("Precio de todo el almacen:")
    println(almacen1.calcular_precio_todo_almacen())
    println("Precio de la marca fontvella:")
    println(almacen1.calcular_precio_marca("fontvella"))
    println("precio estantería 3:")
    println(almacen1.calcular_precio_estanteria(3))


    println("...............................")
    println("Vamos a meter un producto en estant 4, que es el más vacío\n")
    almacen1.agregar2(Agua_mineral(2.0,1.0,"ies_alberti",1,"cazorla"))
    println(almacen1.toString())

    println()
    println("Vamos a imprimir la info de cada bebida del almacen:\n")
    almacen1.informacion_bebidas()

    println("...............................")
    println("Vamos a borrar todas las bebidas de marca fontvella\n")
    //almacen1.eliminar_marca("fontvella")


}//fin programa















/*
ESTO ES LA ESTRUCTURA DEL MENÚ, COMO PLANTILLA. UTILIZAR CUANDO SE NECSITE

    imprimir_menu()
    var opcion= readln().toInt()
    while (true){
        when (opcion){
            1->{} //fin op1
            2->{} //fin op2
            3->{} //fin op3
            4->{} //fin op4
            5->{} //fin op5
            6->{} //fin op6
            7->{} //fin op7
        }  //fin when
        if (opcion==LOQUESEA){
            break
        }
 */

/* //intento 1º opcion when de este prorgama


 println("Introduzca los litros de la bebida que desea introducir\n")
                var litros_bebida= readln().toDouble()
                println("Introduzca el precio de la bebida que desea introducir\n")
                var precio_bebida= readln().toDouble()
                println("Introduzca los litros de la bebida que desea introducir\n")
                var marca_bebida= readln()
                println("Introduzca lel identificadorque desea introducir\n")
                var id_bebida= readln().toInt()
                println("Y la estantería\n")
                var num_estanteria_cliente= readln().toInt()
                println("Qué clase de bebida quiere introducir? " +
                        "1-Azucarada" +
                        "2-Agua")
                var tipo= readln().toInt()
                var porcentaje=0
                var promocion=true
                var manantial="pepepepe"
                if (tipo==1){
                    println("Introduzca el porcentaje de azucar\n")
                    porcentaje= readln().toInt()
                    println("Introduzca si tiene promocion: true/false\n")
                    promocion= readln().toBoolean()
                    almacen1.agregar1(Bebida_azucarada(litros_bebida,precio_bebida,
                        marca_bebida,id_bebida, porcentaje, promocion),num_estanteria_cliente)
                }
                if (tipo==2){
                    println("Introduzca el manantial de origen\n")
                    manantial= readln()
                    almacen1.agregar1(Agua_mineral(litros_bebida,precio_bebida,
                        marca_bebida,id_bebida, manantial),num_estanteria_cliente)
                }

*/

/*
 fun imprimir_menu(){
        println("Qué desea hacer?\n" +
                "1-Agregar bebida\n" +
                "2-Agregar bebida a un estante vacío\n" +
                "3-Agregar al estante con más bebidas de esa marca\n" +
                "4-Comprar (eliminar) una bebida" +
                "5-Calcular precio de toodo el almacen\n" +
                "6-Calcular precio de una estantería\n" +
                "7-Calcular precio de todas las bebidas de una marca\n" +
                "8-Salir")
    }
 */


