package student.test.test

import student.test.Employee
import java.math.BigDecimal

fun main() {
    val joao = Employee(name = "Tiago", cpf = "000.253.365-88", wage = BigDecimal(1000.0))
    println(joao.name)
    println(joao.cpf)
    println(joao.wage)
}