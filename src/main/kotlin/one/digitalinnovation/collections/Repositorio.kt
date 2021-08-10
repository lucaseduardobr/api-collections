package one.digitalinnovation.collections


//cosntruimos um repositorio para simular um banco de dados
class Repositorio<T> {
    private val map=mutableMapOf<String, T>()  // aqui temos chave e valor
    //nosso T aqui embaixo ta sendo funcionario
    fun create(id:String, value:T){
        map[id] = value
    }

    fun remove(id:String) = map.remove(id)

    fun findById(id:String)= map[id] // dado uma chave ele retorna um valor

    fun findAll() = map.values
}