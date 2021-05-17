fun main() {

    val ferrariF50 = Ferrari()
    ferrariF50.acelerar()

}

abstract class Automovel{

    val cor = "Vermelho"

    abstract var nome: String

    abstract  fun acelerar()

    abstract fun frear()

}

class Ferrari: Automovel() {

    override var nome: String = "Ferrari F50"


    override fun acelerar() {
        println("Uma Ferrrai Acelerando")

    }

    override fun frear() {
        println("Uma Ferrari Freando")
    }

}