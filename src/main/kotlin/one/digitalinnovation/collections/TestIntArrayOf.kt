package one.digitalinnovation.collections


//arrays com tamanhos flexiveis
fun main(){
   val values = intArrayOf(2,4,7,4,3)
   values.forEach{ valor ->
      println(valor)
   }

   println("-----------------------")

   values.sort()
   values.forEach{ valor ->
      println(valor)
   }
}