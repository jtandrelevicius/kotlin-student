package student.test

import java.math.BigDecimal

abstract class Employee(
   name: String,
   cpf: String,
   val wage: BigDecimal

) : People(name, cpf) {
   abstract fun calculoAuxilio()
}