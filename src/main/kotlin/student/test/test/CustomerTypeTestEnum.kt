package student.test.test

import student.test.CustomerType

fun main() {
    CustomerType.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.description}")
    }
}