package com.example.testingTheory.regExpTest

class PhoneNumber {
}

fun main() {
    val number = readln()
    val regexp = Regex("[A-Za-z]")
    val res = number.replace(regexp,"")
    println(res)
}