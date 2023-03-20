package ALMACEN

class Almacen(almacen_mapa:MutableMap<Int, MutableList<Bebida>>) {//fin clase


    var estant1: MutableList<Bebida> = mutableListOf()
    var estant2: MutableList<Bebida> = mutableListOf()
    var estant3: MutableList<Bebida> = mutableListOf()
    var estant4: MutableList<Bebida> = mutableListOf()

    var estanterias = mutableMapOf<Int, MutableList<Bebida>>(1 to estant1, 2 to estant2, 3 to estant3, 4 to estant4)
        get(){
            return field
        }

        set(value) {
                field = value
            }



    init {
        estanterias=almacen_mapa
    }

    //comprar\eliminar

    fun comprar(idBorrar:Int) {
        //lo mismo que for i in estanterias.values
        for (estanteria in estanterias.values) {
            //lo mismo que k in i
            for (bebida in estanteria) {
                if (bebida.identificador == idBorrar) {
                    estanteria.remove(bebida)
                    break
                }
            }//fin segundo for
            }//fin for principal
        }//fin fun

    //VAMOS A CALCULAR PRECIOS

    //primeraforma. Agregarla a una estantería que nos digan

    fun agregar1(bebida_nueva: Bebida, num_estanteria: Int) {
        //la interrogación es para que solo añada la bebida si la clave existe
        //es como hacer un if y un else de si está si y si no no en una línea
        estanterias[num_estanteria]?.add(bebida_nueva)

    }

    //agregar al estante + vacío

    fun agregar2(bebida_nueva: Bebida){

        var tamanio=99999999999999
        var posicion=0
        //num_estanteria=key y lista_bebidas=value
        for ((key,value) in estanterias){
            if (value.size<tamanio){
                tamanio=value.size.toLong()
                posicion=key
            }
        }
        estanterias[posicion]?.add(bebida_nueva)

    }//fin agregar2


    //agregar al estante que tenga + bebidas de la misma marca

    fun agregar3(bebida_nueva: Bebida){

        var posicion=0
        var marca_recibida=bebida_nueva.marca

        var contador_almacen=0 //para comparar con el siguiente
        var contador=0
        //key=num_estanteria value=estante
        for ((num_estanteria, estanteria) in estanterias){
            for (i in estanteria){
                if (i.marca==marca_recibida){
                    contador++
                }
            } //fin 2º for

            if (contador>contador_almacen){
                contador_almacen=contador
                posicion=num_estanteria
                }
        }//fin 1º for

        estanterias[posicion]?.add(bebida_nueva)

    }//fin agregar3


    fun calcular_precio_todo_almacen():Double{

        var precio_total=0.0

        for ((num_estanteria, estanteria) in estanterias){
            for(bebida in estanteria){
                precio_total+=bebida.precio
            }
        }
        return precio_total
    }

    fun calcular_precio_estanteria(numero_estanteria: Int):Double{
        var precio_estanteria=0.0
        for (bebida in (estanterias[numero_estanteria]!!)){
            precio_estanteria+=bebida.precio
        }
        return precio_estanteria
    }
    //calculando
    fun calcular_precio_marca(marca_dada:String):Double{
        var precio_marca=0.0
        //key-value
        for ((num_estanteria, estanteria) in estanterias){
            for (bebida in estanteria){
                if (bebida.marca==marca_dada){
                    precio_marca+=bebida.precio
                }
            }
        }
        return precio_marca
    }

    fun calcular_precio_todo_almacen_reutilizando(){
        //reutilizando la función del precio de la estantería
        for ((num_estanteria, estanteria) in estanterias){
            calcular_precio_estanteria(num_estanteria)
            //hacer variable
        }

    }


    override fun toString(): String {
        return estanterias.map { "${it.key}: ${it.value}" }.joinToString("\n")
    }

    fun informacion_bebidas(){
        for ((num_est, estanteria) in estanterias) {
            for (bebida in estanteria) {
                println(bebida.toString())
            }
        }
    }


    /*
    fun eliminar_marca(marca_dada:String){
        for (estanteria in estanterias.values){
            for (bebida in estanteria){
                if (bebida.marca==marca_dada){
                    estanteria.remove(bebida)
                }
            }
        }
    }
    */
}//fin clase









