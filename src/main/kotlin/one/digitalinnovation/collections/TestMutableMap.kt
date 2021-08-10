package one.digitalinnovation.collections

fun main(){
    //instaciamos
    val joao=Funcionario(nome="joao",salario = 1000.0,"CLT")
    val maria=Funcionario(nome="maria",salario = 8000.0,"CLT")
    val rebeca=Funcionario(nome="rebeca",salario = 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>() // ele passa funcionario para a classe Repositorio do arquivo Repositorio.kt

    //aqui ele mapeia usando a funcao create (definida em repositorio.kt
    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(rebeca.nome,rebeca)

    println(repositorio.findById(joao.nome))

    println("-----------------------")

    repositorio.findAll().forEach { println(it) }

    println("-----------------------")

    repositorio.remove(maria.nome)

    repositorio.findAll().forEach { println(it) }



}