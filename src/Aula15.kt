import java.text.NumberFormat
import java.util.*

fun main() {
    val nome: String = "Felipe Pereira"
    println(nome.colocarSobrenome(lastName = "Araújo"))

    val dezReais = 10.0
    println(dezReais.formatarParaReal())

    println("Digite o valor em reais: ")
    val scanner = Scanner(System.`in`)
    val real = readLine()?.toDouble()
    println(real?.formatarParaReal())

}

fun String.colocarSobrenome(lastName: String): String {
    return "$this $lastName"
}
// uma outra forma de escrever o código acima
fun String.colocarSobrenome1(lastName: String) = "$this $lastName"

fun Double.formatarParaReal (): String? {
    val numberFormat = NumberFormat
            .getCurrencyInstance(Locale("pt", "BR"))
    return numberFormat.format(this)

}