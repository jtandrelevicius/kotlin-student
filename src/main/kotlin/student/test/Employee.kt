package student.test

import java.math.BigDecimal

class Employee(
   override val name: String,
   override val cpf: String,
   val wage: BigDecimal

) : People(name, cpf) {

}