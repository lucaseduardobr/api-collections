package one.digitalinnovation.collections

fun main(){
    val joao=Funcionario(nome="joao",salario = 1000.0,"CLT")
    val maria=Funcionario(nome="maria",salario = 8000.0,"CLT")
    val rebeca=Funcionario(nome="rebeca",salario = 4000.0, "PJ")

    val funcionarios = mutableListOf(joao,maria) // uma lista que permite alteracoes
    funcionarios.forEach { println(it) }

    println("-----------------------")

    funcionarios.add(rebeca)
    funcionarios.forEach { println(it) }

    println("-----------------------")


    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------SET--------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("-----------------")
    funcionarioSet.add(rebeca)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("---------SET--------")

    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}