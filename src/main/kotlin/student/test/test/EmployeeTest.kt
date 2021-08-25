package student.test.test

import student.test.Analyst
import student.test.Employee

fun main() {
    val joao = Analyst(name = "Tiago", cpf = "000.253.365-88", wage = 3000.0)
    printReport(joao)
}

fun printReport(employee: Employee) = println(employee.toString())