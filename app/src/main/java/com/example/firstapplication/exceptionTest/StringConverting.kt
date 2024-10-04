package com.example.firstapplication.exceptionTest

import kotlin.NumberFormatException


fun stringToIntLength(input: String): Int {
//    val letters = input.toCharArray()
//    var result = 0
//    for(letter in letters) {
//        if (letter !in '0'..'9') {
//            return -1
//        } else {
//            result++
//        }
//    }
    var result = 0
    try {
        var number = input.toLong()
        do {
            number /= 10
            result++
        } while (number > 0)
    } catch (e: NumberFormatException) {
        result = -1
    }
    return result
}

fun main(args: Array<String>) {
    val strInput = readln()
    println(stringToIntLength(strInput))
}
