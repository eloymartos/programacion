package ALMACEN

class Bebida_azucarada:Bebida {

    var porcentaje_azucar = 20
        get() {
            return field
        }
        set(value) {
            if (value < 0) {
                println("Error. No existen porcentajes negativos\n")
            } else {
                field = value
            }

        }


    var promocion = true
        get() {
            return field
        }
        set(value) {
            field = value
        }

    //enunciado: si tiene promoción tendrá un descuento del 10% en el precio
    /*
    private var descuento = 1.0 //por defecto es 1 para que no afecte al método calcular precio
        get() {
            return field
        }
        set(value) {
            if (promocion == true) {
                field = 0.1
            }
        }
    */

    //constructor completo
    constructor(
        litros: Double,
        precio: Double,
        marca: String,
        identificador: Int,
        porcentaje_azucar: Int,
        promocion: Boolean
    )
            : super(litros, precio, marca, identificador) {
        this.porcentaje_azucar = porcentaje_azucar
        this.promocion = promocion
    }

    //constructor secundario por si no recibe identificador
    constructor(litros:Double,precio:Double,marca:String,porcentaje_azucar: Int, promocion: Boolean):super(litros,
            precio,marca){
        this.porcentaje_azucar = porcentaje_azucar
        this.promocion = promocion
    }


    override fun calcular_precio(cantidad: Int): Double {
        if (promocion==true){
        return (cantidad * precio)-(cantidad*precio*0.1)}
        //también valdría multiplicar precio*0.9
        else{
            return cantidad*precio
        }
    }

    override fun toString(): String {
        return "Bebida_azucarada(identificador:$identificador, litros=$litros, precio=$precio, marca='$marca' +" +
                "porcentaje_azucar=$porcentaje_azucar, promoción=$promocion)"

    }
}