package com.example.testingTheory.stringTest

fun main() {
    val(firstName, lastName, ageString)  = readln().split(" ")
    val age = ageString.toInt()
    println("${firstName.first()}. $lastName, $age years old")
}