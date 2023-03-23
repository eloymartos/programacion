package reló

/**
 * @param minuto [Int] : minuto actual
 * @param hora [Int] : hora actual
 * @param segundo [Int] : segundo actual
 * @property ticTac : suma 1 a segundos, que con los seters suma uno a minutos si llega a ser 60, y lo mismo con minutos a horas, si horas llega a 24 pasa a 0
 * @author Eloy martos
 *
 *
 * @since 1.0
 *
 * ### Esta clase emula el funcionamiento de un reloj, con funciones para mostrar la hora, establecerla y una para que pase un "segundo"
 * ```
 * set(valueS){
 * if (valueS>=60){
 * minuto +=1
 * field = valueS-60
 * }else field = valueS
 * }
 * ```
 * Aqui vemos el funcionamiento de los setters, que al reestablecer el valor se hace restandose 60 y no pasando a 0 por si llega a ser más de 60 asignandose de otra forma
 */
open class Reloj() {
    var hora = 0
        get() = field
        set(valueH){
            if (valueH>=24) field =0 else field = valueH

        }
    var minuto = 0
        get() = field
        set(valueM){
            if (valueM >=60) {
                hora += 1
                field = valueM-60
            }else field = valueM
        }
    var segundo = 0
        get() = field
        set(valueS){
            if (valueS>=60){
                minuto +=1
                field = valueS-60
            }else field = valueS
        }


    open fun setTime(entradaH:Int,entradaM:Int,entradaS:Int){
        hora = entradaH
        minuto = entradaM
        segundo = entradaS
    }

    /**
     * @return String : devuelve los atributos del reloj formateados como cadena
     */
    open fun display():String{
        return "son las $hora, minuto $minuto con $segundo"
    }

    open fun ticTac(){
        segundo ++
    }
}