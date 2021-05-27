//fun main(){
//    nomeEIdadeComDefaultArguments(
//            ultimoNome = "Araújo",
//            nome = "De tal",
//            sobrenome = "Fulano"
//    )
//    var nomeCompleto = nomeEIdadeComRetorno("Felipe", "30")
//
//   testeLambda (2.0) {
//       return@testeLambda "teste função"
//   }
//
//    testeLambda2({
//        return@testeLambda2 "Teste, Teste"
//    }, number = 2.0)
//
////    val number: (Double) -> Double = { number ->
////        2.0
////    }
////
////    println(number())
//
//    val animais = listOf("Peixe", "Cachorro", "Gato")
//    animais.forEach { animal ->
//        println(animal)
//    }
//
//    val b: String? = "13548764548"
//    println(b?.length)
//
//    b?.length ?: run {
//        val soma = 2 + 2
//        println(soma)
//    }
//
//
//}
//
//fun nomeEIdade(nome: String, idade: String) {
//
//}
//
//fun nomeEIdadeComRetorno(nome: String, idade: String): String {
//    return  "O nome é $nome e a idade é $idade"
//
//}
//
//fun nomeEIdadeComDefaultArguments(
//        nome: String = "Fulano",
//        sobrenome: String,
//        ultimoNome: String
//) {
//
//}
//
//fun testeLambda(number: Double, xpto:() -> String) {
//    val sum = 2 + 2
//    println("A string da minha função anonima é ${xpto()}")
//
//}
//
//fun testeLambda2(xpto: () -> String, number: Double) {
//    val sum = 2 + 2
//    println("A string da minha função anonima é ${xpto()}")
//
//}
//
//class NullSafety(
//        val nome: String? = null,
//        val sobrenome: String = "Felipe"
//)