fun main() {
    val ferrariF50 = Ferrari()
    val ferrariF40 = Ferrari()
    ferrariF40.nome = "Ferrari Tesla"
    val ferrariF60 = ferrariF40

//    println(ferrariF40.toString())

//    println(ferrariF40.nome)
//    println(ferrariF50.nome)
//
//    ferrariF60.nome = "Ferrari Fiat"
//
//    println(ferrariF40.nome)
//    println(ferrariF60.nome)
//
//    if (ferrariF40 == ferrariF50) {
//        println("São iguais")
//    } else {
//        println("São diferentes")
//    }
//
    if (ferrariF40 == ferrariF60) {
        println("São iguais")
    } else {
        println("São diferentes")
    }

    println(ferrariF40.hashCode())
    println(ferrariF60.hashCode())

}