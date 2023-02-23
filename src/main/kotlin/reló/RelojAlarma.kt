package reló


class RelojAlarma:Reloj() {
    var horaAlarma = 0
        get() = field
        set(value){
            if (value !in 0..24){
                println("valor incorrecto en hora, intente de nuevo : ")
                horaAlarma = readln().toInt()
            }
            field = value
        }
    var minutoAlarma = 0
        get() = field
        set(value){
            if (value !in 0..60){
                println("valor incorrecto en minuto, intente de nuevo : ")
                horaAlarma = readln().toInt()
            }
            field = value
        }

    fun setAlarm(horaA:Int, minutoA:Int){
        horaAlarma = horaA
        minutoAlarma = minutoA
    }

    override fun ticTac(){
        super.ticTac()
        if (minuto == minutoAlarma && hora == horaAlarma && segundo == 0 ) println("Alarma sonando!!!")
    }
}


fun main(){
    val alarmica = RelojAlarma()
    alarmica.setTime(18,35,23)
    alarmica.setAlarm(18,52)
    for(i in 1..1000) {
        alarmica.ticTac()
        println(alarmica.display())
    }
}