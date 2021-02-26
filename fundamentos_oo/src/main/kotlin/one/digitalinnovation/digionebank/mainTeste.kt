package one.digitalinnovation.digionebank

import java.math.BigDecimal

class mainTeste {

}

fun main() {
    val conta = Conta("41599","3124", BigDecimal(3500))
    val banco = Banco("BB", "666")

    println("Saldo Bancario: "+conta.saldo)
    conta.saque(BigDecimal(500))
    println("Saldo Bancario: "+conta.saldo)

    val pf = ClienteTipo.PF
    println(pf.name+" - "+pf.descricao)

    val pj = ClienteTipo.PJ
    println(pj.name+" - "+pj.descricao)

}