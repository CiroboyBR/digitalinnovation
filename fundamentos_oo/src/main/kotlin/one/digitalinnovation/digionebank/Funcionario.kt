package one.digitalinnovation.digionebank

abstract class Funcionario(
    var nome: String,
    var cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilo(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario $salario
        Auxilio: ${calculoAuxilo()}
    """.trimIndent()

}