package com.example.testingTheory.functionReferenceTest

class Employee(val id: Int, val name: String, val lastName: String, val telNum: String, val email: String) {

    fun printData() {
        println("Employee $id")
        println("full name: $name $lastName")
        println("tel. num: $telNum")
        println("email: $email")
    }
}

fun generateEmployees(quantity: Int, creator: (Int, String, String, String, String) -> Employee): List<Employee> {
    var id = 0
    val employees = mutableListOf<Employee>()
    for(i in 1..quantity) {
        val (name, lastName, telNum, email) = readln().split(" ")
        val newEmployee = creator(++id, name, lastName, telNum, email)
        employees.add(newEmployee)
    }
    return employees
}

fun printAllData(employees: List<Employee>) {
    for (employee in employees) {
        val action = employee::printData
        action.invoke()
    }
}

fun main() {
    var quantity = readln().toInt()
    val employees = generateEmployees(quantity, ::Employee)
    printAllData(employees)
}