class rectangulo(valor1:Int, valor2:Int) {
    var base = 0
    var altura = 0

    init {
        if (valor1 >= 0) base = valor1
        altura = valor2
    }
    constructor(otrorectangulo: rectangulo): this(otrorectangulo.base, otrorectangulo.altura)
    fun area(){
        println(base*altura)
    }
    fun perimetro(){
        println(base*2 + altura*2)
    }

    override fun toString(): String {
        return "rectangulo(base=$base, altura=$altura)"
    }

}