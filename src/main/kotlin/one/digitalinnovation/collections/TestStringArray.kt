package one.digitalinnovation.collections

fun main(){
   val nomes = Array(3) {""}
    nomes[0] = "maria"
    nomes[1] = "jose"
    nomes[2] = "joaozinho"

    for (nome in nomes){
        println(nome)
    }

    println("-----------------------")

    nomes.sort()
    nomes.forEach { println(it) }

    println("-----------------------")
    val nomes2= arrayOf("ZEZE","ZAZA","ZUZU")
    nomes2.sort()
    nomes2.forEach { println(it) }

}