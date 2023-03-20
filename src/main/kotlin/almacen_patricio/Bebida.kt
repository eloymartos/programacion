package ALMACEN

abstract class Bebida(litros: Double, precio: Double, marca:String, identificador:Int) {

    var identificador=0
        get(){
            return field
        }
        set(value) {

            if (value<0){
                println("error. El código debe ser positivo\n")
            }

            //Si ese código ya existe le asignamos el mayor que tengamos en el almacen de num_serie +1
            if (value in num_serie_lista){

                println("El nº ya pertenece a otro código. A su bebida se le asignará el mayor código existente en el" +
                        "almacen +1\n")
                field= (num_serie_lista.max())+1
                num_serie_lista.add(field)
            }
            else{
                //
                field = value
                num_serie_lista.add(field)
            }

        }

    var litros=0.5
        get(){
            return field
        }

        set(value) {
            if (value<0.33){
                println("Error. el volumen mínimo es 0.33 litros debe ser mayor que 0\n")
            }
            else{
                field = value
            }

        }

    var precio=0.5
        get(){
            return field
        }

        set(value) {
            if (value<=0){
                println("Error. el precio debe ser mayor que 0\n")
            }
            else{
                field = value
            }

        }

    var marca="defecto"
        get(){
            return field
        }

        set(value) {
            if (value.length<4 || value.length>30){
                println("Error. el nombre de la marca debe tener entre 4 y 30 caracteres\n")
            }
            else{
                field = value
            }

        }


    companion object{
        //es un almacen que "guarda" los num de series que ya se han utilizado

        private var num_serie_lista= mutableListOf<Int>()
    }

    init {
        this.identificador=identificador
        this.litros=litros
        this.precio=precio
        this.marca=marca
    }

    //constructor secundario para que reciba toodo menos el identificador
    //al no recibirlo le asigno por defecto el mayor que ya tenemos +1 para que no esté repetido

    constructor(litros: Double, precio: Double, marca: String):this(litros,precio, marca, ((num_serie_lista.max())+1))


    //método calcular precio

    //podría no ser abtsracta porque ya se como se calcula y luego sobre se sobreescribiría
    abstract fun calcular_precio(cantidad:Int):Double

    override fun toString(): String {
        return "Bebida(identificador=$identificador, litros=$litros, precio=$precio, marca='$marca')"
    }





}