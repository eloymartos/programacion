

class Agua_mineral:Bebida {


    var manantial_origen=""
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

    //constructor completo
    constructor(litros: Double, precio: Double, marca:String, identificador:Int, manantial_origen:String):super(
        litros, precio, marca, identificador){
        this.manantial_origen=manantial_origen
    }

    //constructor secundario por si no recibe identificador
    constructor(litros: Double, precio: Double, marca:String, manantial_origen:String):super(
        litros, precio, marca){
        this.manantial_origen=manantial_origen
    }

/*
    override fun calcular_precio(cantidad:Int):Double {
        return cantidad*precio
    }

 */

    override fun toString(): String {
        return super.toString()+ "manantial_origen='$manantial_origen')"
      /*  "Agua_mineral(identificador:$identificador, litros=$litros, precio=$precio, marca='$marca' +"+
                "manantial_origen='$manantial_origen')"

       */
    }


}