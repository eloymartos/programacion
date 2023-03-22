import java.io.File


fun main(args: Array<String>) {

// Dos rutas absolutas
val carpetaAbs = File("/Users/eloy/Desktop/clase/programacion/tema_4/Kotlin/data/")

val archivoAbs = File("/Users/eloy/Desktop/clase/programacion/tema_4/Kotlin/data/texto.txt")




// Mostremos sus rutas
mostrarRutas(carpetaAbs)

mostrarRutas(archivoAbs)

}




fun mostrarRutas(f: File) {

println("getParent(): " + f.parent)

println("getName(): " + f.name)

println("getAbsolutePath(): " + f.absolutePath)

}

