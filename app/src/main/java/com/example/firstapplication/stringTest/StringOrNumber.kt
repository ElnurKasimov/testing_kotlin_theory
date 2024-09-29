package com.example.firstapplication.stringTest

fun isNumber(input: String) : Any {
    val number = input.toIntOrNull()
    if(number == null) {
        return input
    } else return {
        number
    }
}

fun main() {
    for (i in 1..2) {
        val input = readln()
        println(isNumber(input))
    }
}