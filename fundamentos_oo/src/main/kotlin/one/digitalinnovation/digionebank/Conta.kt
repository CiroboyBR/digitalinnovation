package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    var saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){
        saldo = saldo.plus(valor)
    }

    fun saque(valor: BigDecimal){
        saldo = saldo.minus(valor)


    }

}