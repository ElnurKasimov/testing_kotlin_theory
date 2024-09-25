package com.example.firstapplication.regExpTest

import kotlin.NumberFormatException


fun stringToIntLength(input: String): Int {
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
