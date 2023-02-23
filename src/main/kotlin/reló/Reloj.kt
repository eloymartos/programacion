package reló

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

    open fun display():String{
        return "son las $hora, minuto $minuto con $segundo"
    }

    open fun ticTac(){
        segundo ++
    }
}