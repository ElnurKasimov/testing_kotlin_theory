package com.example.testingTheory.stringTest

fun isNumber(input: String) : Any {
//    val number = input.toIntOrNull()
//    if(number == null) {
//        return input
//    } else {
//        return number
//    }
    return input.toIntOrNull() ?: input

}

fun main() {
    for (i in 1..2) {
        val input = readln()
        println(isNumber(input).toString())
    }
}