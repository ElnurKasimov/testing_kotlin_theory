package com.example.firstapplication.syntaxTest

fun main() {
   var sum = 0
    do {
        val number = readln().toInt()
        sum += number
    } while (number != 0)
    println(sum)
}