import java.lang.ArithmeticException
import java.lang.IndexOutOfBoundsException
import java.lang.NullPointerException
import kotlin.jvm.Throws

fun main() {
    val exercicio1: MutableList<String> = mutableListOf()
    exercicio1.add("Patp")
    exercicio1.add("Cachorro")
    exercicio1.add("Garo")
    try {
//        println(exercicio1[3])
    } catch ( index: IndexOutOfBoundsException){
//        println(index.stackTraceToString())
    }

    val exercicio2: MutableList<String>? = mutableListOf()
    exercicio1?.add("Patp")
    exercicio1?.add("Cachorro")
    exercicio1?.add("Garo")
//    println(exercicio2!![2])

    try {
        println(exercicio2!![5])
    } catch ( ex: NullPointerException){
//        println(ex.stackTraceToString())
    }catch ( ex: IndexOutOfBoundsException) {
//        println(ex.stackTraceToString())
    }

    val calculoMatematico = CalculoMatematico()
//    calculoMatematico.divisao(4, 0)
    try {
        calculoMatematico.divisao(4, 0)
    } catch (ex: ArithmeticException) {
        println(ex.message)
    }
}


class CalculoMatematico {

    @Throws(ArithmeticException::class)
    fun divisao(x: Int, y: Int): Int {
        return if (y == 0) {
            throw ArithmeticException("Divisão por zero")
        } else {
            x / y
        }
    }
}
