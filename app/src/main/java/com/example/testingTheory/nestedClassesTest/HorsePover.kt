package com.example.testingTheory.nestedClassesTest

class Vehicle(val name: String) {
    inner class Engine(val horsePower: Int) {
        fun start() {
            println("RRRrrrrrrr....")
        }

        fun printHorsePower() {
            println("The $name vehicle has ${Vehicle(name).Engine(horsePower).horsePower} horsepower")
        }
    }
}
fun main() {
    val vehicle1 = Vehicle("Dixi")
    val engine = vehicle1.Engine(20)
    engine.printHorsePower()
}