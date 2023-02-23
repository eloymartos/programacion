package pruebaLinea

class Line(fir:Double, sec:Double, thi:Double, fou:Double):RelationInterface() {

    private var x1 = 0.0
    private var x2 = 0.0
    private var y1 = 0.0
    private var y2 = 0.0

    init {
        x1 = fir
        x2 = sec
        y1 = thi
        y2 = fou
    }

    fun getLength():Double{
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
    }

    override fun isEqual(a: Any): Boolean {
        a as Line
        return if(getLength() == a.getLength()) true else false
    }

    override fun isGreater(a: Any): Boolean {
        a as Line
        return if (getLength() > a.getLength()) true else false

    }

    override fun isLess(a: Any): Boolean {
        a as Line
        return if(getLength() < a.getLength()) true else false
    }

}