package com.example.testingTheory.classTest

@Suppress("MemberVisibilityCanBePrivate")
class Client {
    var name: String = "Unknown"
    var age: Int = 18
        get() {
            println("someone tries to get age")
            return field
        }
        set(value) {
            field = if (value < 0) {
                println("Age cannot be negative. Set to $defaultAge")
                defaultAge
            } else
                value
        }
    val defaultAge = 18
    val info: String
        get() {
            return "name = $name, age = $age"
        }
}

fun main() {
    val client = Client()
    println(client.name)
    println(client.age)
    println(client.info)

}