package com.example.testingTheory.integerTest

import java.util.*

fun transformList(numbersString: String): String {
    val numbers = numbersString.split(",").map { it.toInt() }.toMutableList()
    for(i in numbers.indices) {
        if(numbers[i] % 2 == 0) numbers[i] /= 2 else numbers[i] *= 2
    }
    return numbers.joinToString(",")
}

fun main() {
    val scanner = Scanner(System.`in`)

    // The input will be read as a String, and you will need to parse it to a MutableList of Integers.
    val numbersString = scanner.nextLine()

    val transformedListString = transformList(numbersString)

    // Print the transformed list as a string.
    println(transformedListString)
}