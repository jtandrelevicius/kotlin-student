package student.test

class People {
    var nome : String = "Jefferson Tiago"

    //DEIXA A PROPRIEDADE SET PRIVADA ASSIM NAO SERA ALTARADO MAIS APOS CRIAR A INSTACIA
    var cpf : String = "000.233.000-33"
    private set

    //RECURSO INNER CLASS CRIA UMA CLASSE INTERNA
    //inner  class Endereco{
        //var rua : String = "Rua teste"
    //}

    constructor()
    //FUNCTION UNINDO NOME E CPF UTILIZANDO O $ INTERPOLACAO
    fun peopleInfo() = "$nome - $cpf"
}

fun main() {
    val jeff = People()

    //println(jeff.nome)
    //println(jeff.cpf)
    //println(jeff.Endereco().rua)

    println(jeff.peopleInfo())
}