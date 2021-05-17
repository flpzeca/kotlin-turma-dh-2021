//fun main() {
//    val felipe = Cliente("123", "Felipe", "4658879", 2134687654)
//    val contaPoupancaCaixa = ContaPoupanca(cliente = felipe)
//    contaPoupancaCaixa.deposito(100.0)
//    contaPoupancaCaixa.recolherJuros()
//
//    val contaCorrenteItau = ContaCorrente(cliente = felipe)
//    contaCorrenteItau.sacar()
//}
//
//class Cliente(
//     numeroCliente: Int,
//     sobrenome: String,
//     rg: String,
//     cpf: String
//)
//
//open class Conta(
//
//     cliente: Cliente,
//) {
//
//    var saldo: Double = 0.0
//
//    fun deposito() {
//        //fazer deposito
//    }
//
//    open fun Sacar() {
//        //fazer saque
//    }
//
//    fun consultarSaldo() {
//        //consultar saldo
//    }
//}
//
//class ContaPoupanca(
//        cliente: Cliente,
//        var taxaJuros: Double = 3.5
//): Conta(cliente = cliente) {
//
//    fun recolherJuros(){
//        val juros = saldo * (taxaJuros / 100)
//        saldo *= juros
//        println("Meu novo saldo é $saldo")
//        //recolher os juros em relação a taxa de juros
//    }
//
//}
//
//class ContaCorrente(
//        cliente: Cliente
//): Conta(cliente = cliente) {
//
//    fun depositarCheque() {
//      //depositar um novo cheque
//    }
//
//    override fun sacar() {
//     //sacar conta corrente
//    }
//}
