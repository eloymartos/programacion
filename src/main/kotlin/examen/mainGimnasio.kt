package examen

fun main() {
    var trabajador1 = Trabajador("carlos",26,1000,200)
    var trabajador2 = Trabajador("carla", 23, 1001, 201)
    var socio = Socio("eloy", 19)
    var sociocon1 = SocioConActividades("valerio", 17, arrayOf())
    var sociocon2 = SocioConActividades("yoli", 56, arrayOf(1,2,5))
    var socioplus = SocioPlus("mercedes", 92)

    var gimnasioZeus = Gimnasio("gimnasioZeus", "calle larga 3")
    gimnasioZeus.anadirPersona(trabajador1)
    gimnasioZeus.anadirPersona(trabajador2)
    gimnasioZeus.anadirPersona(socio)
    gimnasioZeus.anadirPersona(sociocon2)
    gimnasioZeus.anadirPersona(sociocon1)
    gimnasioZeus.anadirPersona(socioplus)

    println(gimnasioZeus.toString())

}