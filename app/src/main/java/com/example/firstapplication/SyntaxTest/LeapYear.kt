package com.example.firstapplication.SyntaxTest

fun main() {
    val year = readln().toInt()
    val type = when {
        (year % 4 == 0) and (year % 100 != 0) -> "Leap"
        year % 400 == 0 -> "Leap"
        else -> "Regular"
    }
    println (type)
}