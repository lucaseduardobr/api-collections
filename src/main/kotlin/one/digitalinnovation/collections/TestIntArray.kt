package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0]=1
    values[1]=3
    values[2]=5
    for (valor in values) {
        println(valor)
    }

    println("-----------------------")

    values.forEach{
        println(it)
    }

    //ou
    println("-----------------------")

    values.forEach{ valor ->
        println(valor)
    }

    println("-----------------------")

    for (index in values.indices){
        println(values[index])
    }

    println("-----------------------")

    values.sort() //menor pro maior

    for (valor in values){
        println(valor)
    }


}