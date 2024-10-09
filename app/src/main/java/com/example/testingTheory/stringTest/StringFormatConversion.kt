package com.example.testingTheory.stringTest

fun main() {
    val date = readln()
    val numbers = date.split("-")
    println("${numbers[2]}/${numbers[1]}/${numbers[0]}")
}