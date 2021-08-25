package student.test


class Analyst(name: String, cpf: String, wage: Double):Employee(name, cpf, wage){
    override fun calculoAuxilio() = wage * 0.1

}