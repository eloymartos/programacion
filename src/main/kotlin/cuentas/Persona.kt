package cuentas

class Persona(DNI_or:String, cuentas_or: MutableList<Cuenta>) {
    val DNI = DNI_or
    var cuentas = mutableListOf<Cuenta>()
        get(){return field}set(valor){
            if (valor.size > 3) println("error de cantidad de cuentas") else field = valor
        }

    init {
        cuentas = cuentas_or
    }

    fun otra_cuenta(otra: Cuenta){
        if(cuentas.size >=3) println("cantidad de cuentas maxima en esta persona") else{
            cuentas.add(otra)
        }
    }

    fun morosidad() : Boolean{
        for (i in cuentas) if (i.saldo_disponible < 0) return true
        return false
    }
}