fun main() {

    val ferrariF50 = Ferrari()
    ferrariF50.acelerar()

}

abstract class Automovel {

    val cor = "Vermelho"

    abstract var nome: String

    abstract fun acelerar()

    abstract fun frear()

}

class Ferrari : Automovel() {

    override var nome: String = "Ferrari F50"


    override fun acelerar() {
        println("Uma Ferrrai Acelerando")

    }

    override fun frear() {
        println("Uma Ferrari Freando")
    }

    override fun equals(other: Any?): Boolean {
        val outraFerrari = other as? Ferrari
        return when (other) {
            is Ferrari -> {
                this.nome == outraFerrari?.nome
            }
            is Double -> {
                true
            }
            else -> {
                return super.equals(other)
            }
        }

    }

    override fun toString(): String {
        return ("Meu nome é $nome")
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}