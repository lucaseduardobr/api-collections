package one.digitalinnovation.collections

fun main(){
    val joao=Funcionario(nome="joao",salario = 1000.0,"CLT")
    val maria=Funcionario(nome="maria",salario = 8000.0,"CLT")
    val rebeca=Funcionario(nome="rebeca",salario = 4000.0, "PJ")

    val funcionario1 = setOf(joao,maria) //jusnta esses caras ai
    val funcionario2 = setOf(rebeca)
    funcionario1.forEach { println(it) }
    println("-----------------------")
    val resultUnion = funcionario1.union(funcionario2) // uniao entre funcionario1 com funcionario2
    resultUnion.forEach{println(it)}
    println("-----------------------")
    val funcionario3 = setOf(joao,maria,rebeca)
    val resultUnion2 = funcionario3.subtract(funcionario2) // subtracao
    resultUnion2.forEach { println(it) }
    println("-----------------------")

    val funcionario4 = setOf(joao,maria,rebeca)
    val resultUnion3 = funcionario4.intersect(funcionario2) // interseçao de conjuntos
    resultUnion3.forEach { println(it) }



}