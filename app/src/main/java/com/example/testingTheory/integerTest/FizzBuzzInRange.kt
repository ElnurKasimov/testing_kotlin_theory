package com.example.testingTheory.integerTest

fun main() {
    val from = readln().toInt()
    val to = readln().toInt()
    for(i in from..to) {
        println (
            when {
                i % 15 == 0 -> "FizzBuzz"
                i % 5 == 0 -> "Buzz"
                i % 3 == 0 -> "Fizz"
                else -> i
            }
        )
    }
}