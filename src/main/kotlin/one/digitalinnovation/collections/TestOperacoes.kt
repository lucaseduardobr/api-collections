package one.digitalinnovation.collections

fun main(){
     val salarios = doubleArrayOf(1500.0,1250.0,500.0)
     for (salario in salarios){
         println(salario)
     }
     println("-----------------------")

     println("maior salario: ${salarios.maxOrNull()}")
     println("menor salario: ${salarios.minOrNull()}")
     println("media salario: ${salarios.average()}")

     println("-----------------------")

     val salariosMaiorQue1000 = salarios.filter{it < 1300.0}
     salariosMaiorQue1000.forEach { println(it) }

     println("-----------------------")

     //pegando o numero salarios em intervalos

     println(salarios.count {it in 1000.0 .. 1300.0})

     println("-----------------------")


          //se ele nao achar ele retornara NULL
     println(salarios.find {it == 1250.0})

     println("-----------------------")
     //se é vdd ou nao

     println(salarios.any {it == 1250.0})


}