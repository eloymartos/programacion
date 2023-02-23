package cuentas

class Cuenta(saldo_disponible_or : Double) {
    var n_cuenta = 0
    var saldo_disponible = 0.0

    init {
        contador +=1
        n_cuenta = (base + contador)
        saldo_disponible = saldo_disponible_or
    }

    fun consultar_saldo(){
        println("el saldo disponible es = $saldo_disponible")
    }

    fun recibir_abono(cantidad : Double){
        saldo_disponible += cantidad
        consultar_saldo()
    }

    fun pagar(deuda: Double){
        saldo_disponible -= deuda
        consultar_saldo()
    }

    fun transferencia(otracuenta: Cuenta, dado: Double){
        saldo_disponible -= dado
        otracuenta.saldo_disponible += dado
    }

    companion object{
        val base = 21000000
        var contador = 0
    }

}