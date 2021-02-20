package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ciro"
    var cpf: String = "021.021.245-85"
    private set
}

fun main() {
    val ciro = Pessoa()
    ciro.cpf = "123" //Esse set não vai funcionar porque a classe especificou que está privado

    println("Nome: "+ciro.nome)
    println("CPF: "+ciro.cpf)

}