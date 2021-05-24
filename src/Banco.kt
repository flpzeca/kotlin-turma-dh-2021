//fun main() {
//    val cesarContaCorrente = ContaCorrente(
//            numeroConta = 1234,
//            taxaDeOperacao = 10.0
//    )
//    val eduContaPoupanca = ContaPoupanca(
//            numeroConta = 4321,
//            limite = 10.0
//    )
////    cesarContaCorrente.depositar(100.0)
////    eduContaPoupanca.depositar(100.0)
////    cesarContaCorrente.sacar(50.0)
////    eduContaPoupanca.sacar(30.0)
//
//    val relatorio = Relatorio()
//
////    relatorio.gerarRelatorio(cesarContaCorrente)
////    relatorio.gerarRelatorio(eduContaPoupanca)
////
////    cesarContaCorrente.sacar(20.0)
////    eduContaPoupanca.sacar(75.0)
////
////    relatorio.gerarRelatorio(cesarContaCorrente)
////    relatorio.gerarRelatorio(eduContaPoupanca)
////
////    eduContaPoupanca.sacar(5.0)
////
////    relatorio.gerarRelatorio(cesarContaCorrente)
////    relatorio.gerarRelatorio(eduContaPoupanca)
////
////    eduContaPoupanca.sacar(1.0)
////
////    cesarContaCorrente.depositar(100.0)
////    eduContaPoupanca.depositar(100.0)
////
////    eduContaPoupanca.transferir(10.0, cesarContaCorrente)
////
////    relatorio.gerarRelatorio(cesarContaCorrente)
////    relatorio.gerarRelatorio(eduContaPoupanca)
//
//    val banco = Banco()
//}
//
//fun ContaPoupanca(numeroConta: Int, limite: Double) {
//
//}
//
//fun ContaCorrente(numeroConta: Int, taxaDeOperacao: Double) {
//
//}
//
//abstract class ContaBancaria {
//
//    abstract val conta: Int
//
//    abstract val numeroConta: Int
//
//    abstract val saldo: Double
//
//    abstract fun sacar(value: Double)
//
//    abstract fun depositar(value: Double)
//
//    fun transferir(value: Double, contaBancaria: ContaBancaria) {
//        sacar(value)
//        contaBancaria.depositar(value)
//    }
//
//    abstract fun mostrarDados()
//}
//
//class ContaCorrente(
//        override var numeroConta: Int,
//        override var saldo: Double = 0.0,
//        val taxaDeOperacao: Double, override val conta: Int
//): ContaBancaria(), Imprimivel {
//
//    override fun sacar(value: Double) {
//        if (value > (saldo - taxaDeOperacao)) {
//            println("Saldo insuficiente")
//        } else {
//            saldo -= value + taxaDeOperacao
//            println("Saque executado com sucesso")
//        }
//    }
//
//    override fun depositar(value: Double) {
//        saldo += value - taxaDeOperacao
//        println("Depósito realizado com sucesso")
//    }
//
//    override fun mostrarDados() {
//        println("O número da conta é $numeroConta," +
//                " o meu saldo é $saldo e a minha" +
//                " taxa de operação é $taxaDeOperacao"
//        )
//    }
//}
//
//class ContaPoupanca(
//        override val numeroConta: Int,
//        override var saldo: Double = 0.0,
//        val limite: Double, override val conta: Int
//): ContaBancaria(), Imprimivel {
//
//    override fun sacar(value: Double) {
//        val saldoTotal = saldo + limite
//        if (value > saldoTotal) {
//            println("Saldo insuficiente")
//        } else {
//            saldo -= value
//            println("Saque executado com sucesso")
//        }
//    }
//
//    override fun depositar(value: Double) {
//        saldo += value
//        println("Depósito realizado com sucesso")
//    }
//
//    override fun mostrarDados() {
//        println("O número da conta é $numeroConta," +
//                " o meu saldo é $saldo e o meu" +
//                " limite é $limite e o saldo total é ${saldo + limite}"
//        )
//    }
//}
//
//interface Imprimivel {
//
//    abstract val contaPoupanca: ContaBancaria
//
//    fun mostrarDados()
//}
//
//class Relatorio {
//
//    fun gerarRelatorio(imprimivel: Imprimivel) {
//        imprimivel.mostrarDados()
//    }
//}
//
//class Banco():Imprimivel {
//
//    var contasBancarias = mutableListOf<ContaBancaria>()
//
//    fun inserirConta(contaBancaria: ContaBancaria) {
//        contasBancarias.add(contaBancaria)
//        println("Conta inserida com sucesso")
//    }
//
//    fun removerConta(contaBancaria: ContaBancaria) {
//        for (i in contasBancarias) {
//            if (i == contaBancaria) {
//                contasBancarias.remove(i)
//                println("Conta removida com sucesso")
//            } else{
//                println("Conta não localizada")
//            }
//        }
//    }
//
//    fun procurarConta(numeroConta: Int): ContaBancaria? {
//        for (i in contasBancarias) {
//            if (i.conta == numeroConta) return i
//        }
//        return null
//    }
//
//    override fun mostrarDados() {
//        contasBancarias.forEach(){
//            it.mostrarDados()
//        }
//    }
//
//    fun exebirMenu(){
//        println("__________________________________")
//        println("____________BANCO DH______________")
//        println("__________________________________")
//        when(readLine()?.toIntOrNull()){
//            1 -> {
//                println("Qual o tipo de conta você quer criar? CC/CP")
//                val opcao = readLine().toString()
//                if(opcao == "CC" || opcao == "cc"){
//                    val numero = contasBancarias.last().numeroConta + 1
//                    val contaCorrente = ContaCorrente(numero, taxaDeOperacao = 2.00)
//                    contasBancarias.add(contaCorrente)
//                    println(numero)
//                }else if (opcao == "CP" || opcao "cp"){
//                    val numero = contasBancarias.last().numeroConta + 1
//                    val contaPoupancanca = ContaPoupanca(numero, limite = 100.00)
//                    contasBancarias.add(contaPoupanca)
//                    println(numero)
//                }
//            }
//        }
//    }
//
//}
//
//
