package student.test

class People {
    var nome : String = "Jefferson Tiago"
    var cpf : String = "000.233.000-33"
}

fun main() {
    val jeff = People()

    println(jeff.nome)
    println(jeff.cpf)
}