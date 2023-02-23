package cuentas

fun main(){
    val sujeto = Persona("46266616t", mutableListOf(Cuenta( 0.0), Cuenta(700.0)))
    sujeto.cuentas[0].recibir_abono(1100.0)
    sujeto.cuentas[1].pagar(750.0)
    if (sujeto.morosidad()) println("debe usted dinero en alguna cuenta") else println("está usted limpio")

    sujeto.cuentas[0].transferencia(sujeto.cuentas[1], 200.0)
    if (sujeto.morosidad()) println("debe usted dinero en alguna cuenta") else println("está usted limpio")

    for (i in sujeto.cuentas) println(i.n_cuenta)
}