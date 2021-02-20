package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ciro"
    var cpf: String = "021.021.245-85"

    inner class Endereco {
        var logradouro: String = "Rua A"
        var numero: Int = 401
    }
}

fun main() {
    val ciro = Pessoa()

    println("Nome: "+ciro.nome)
    println("CPF: "+ciro.cpf)
    println("CPF: "+ciro.Endereco().logradouro)
}