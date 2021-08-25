package student.test

import java.math.BigDecimal

abstract class Employee(
   name: String,
   cpf: String,
   val wage: Double

) : People(name, cpf) {
   protected abstract fun calculoAuxilio(): Double

   override fun toString(): String = """"
      Nome: $name
      CPF: $cpf
      Salario: $wage
      Auxilio: ${calculoAuxilio()}
   """.trimMargin()
}