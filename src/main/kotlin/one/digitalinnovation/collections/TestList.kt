package one.digitalinnovation.collections

fun main(){
    val joao=Funcionario(nome="joao",salario = 1000.0,"CLT")
    val maria=Funcionario(nome="maria",salario = 8000.0,"CLT")
    val rebeca=Funcionario(nome="rebeca",salario = 4000.0, "PJ")
    val funcionarios = listOf(joao,maria,rebeca)
    funcionarios.forEach { println(it) }

    println("-----------------------")

    println(funcionarios.find { it.nome =="maria" })

    println("-----------------------")


    funcionarios
        .groupBy { it.tipoDeContratacao } // serve pra agrupar dois tipos
        .forEach { println(it) }

        /*
    funcionarios
        .sortedBy { it.salario } serve pra ordenar
        .forEach { println(it) }



    */
}
//quando vem pegar os dados de funcionario para imrpimir
//eles pegam esse dados e imprimem como na override function
data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoDeContratacao:String
) {
    override fun toString(): String =
        """
            Nome: $nome
            salario: $salario
             
        """.trimIndent()
}
