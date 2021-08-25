package student.test

class People {
    var nome : String = "Jefferson Tiago"
    var cpf : String = "000.233.000-33"

    inner  class Endereco{
        var rua : String = "Rua teste"
    }
}

fun main() {
    val jeff = People()

    println(jeff.nome)
    println(jeff.cpf)
    println(jeff.Endereco().rua)
}