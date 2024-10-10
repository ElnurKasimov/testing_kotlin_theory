package com.example.testingTheory.classTest

@Suppress("MemberVisibilityCanBePrivate")
class Person (var name: String, age: Int){
    var age: Int = age
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
    init {
        this.age = age
    }
    val info: String
        get() {
            return "name = $name, age = $age"
        }
}

fun main() {
    val person = Person("John", 22)
    println(person.info)
    val person2 = Person("Sarah", -22)
    println(person2.info)
}