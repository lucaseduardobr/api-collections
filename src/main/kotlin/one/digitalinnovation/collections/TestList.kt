package one.digitalinnovation.collections

fun main(){
    val joao=Funcionario(nome="joao",salario = 1000.0)
    val maria=Funcionario(nome="maria",salario = 2000.0)
    val rebeca=Funcionario(nome="rebeca",salario = 4000.0)
    val funcionarios = listOf(joao,maria,rebeca)
    funcionarios.forEach { println(it) }
    println(funcionarios.find { it.nome =="maria" })
}
//quando vem pegar os dados de funcionario para imrpimir
//eles pegam esse dados e imprimem como na override function
data class Funcionario(
    val nome:String,
    val salario:Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            salario: $salario
             
        """.trimIndent()
}
