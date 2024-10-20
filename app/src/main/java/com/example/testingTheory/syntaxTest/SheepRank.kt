package com.example.testingTheory.syntaxTest

fun calculateRank(weight: Int): Int {
    return when {
        weight < 30 -> 1
        weight in 30 until 50 -> 2
        weight in 50 until 70 -> 3
        else -> 4
    }
}

// The main function reads the input and calls calculateRank to rank the sheep.
fun main() {
    // Read the weight of the sheep
    val weight = readln().toInt()

    // Call calculateRank and print the result
    println(calculateRank(weight))
}