package com.example.firstapplication.extensionFunctionTest

fun Int.lastDigit(): Int {
    return this % 10
}

fun main() {
    println(1234.lastDigit())
}