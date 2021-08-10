package one.digitalinnovation.collections

import java.math.BigDecimal

//se vc precisa de funcoes que nao tem em array
//vc mesmo pode cria las, aqui criamos a funcao somatoria e a media para o array BigDecimal
fun Array<BigDecimal>.somatoria() = this.reduce{ // a funcao reduce acumula valores, nesse caso somamaos todos os valores
    acc, valor -> acc+valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria()/this.size.toBigDecimal()