package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Pessoa {
    var nome: String = "Ciro"
    var cpf: String = "021.021.245-85"
    private set //Seta privado apenas o campo cpf

   // constructor()
}

fun main() {
    val ciro = Pessoa()
    val conta = Conta("41599","3124", BigDecimal(3500))
    val banco = Banco("BB", "666")

    println("Nome: "+ciro.nome)
    println("CPF: "+ciro.cpf)
    println("Saldo Bancario: "+conta.saldo)
    conta.saque(BigDecimal(500))
    println("Saldo Bancario: "+conta.saldo)

    ClienteTipo.values().forEach { elemento->
        println(elemento.name+" - "+elemento.descricao)
    }

}