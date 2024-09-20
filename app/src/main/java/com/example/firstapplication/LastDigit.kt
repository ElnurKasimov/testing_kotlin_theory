package com.example.firstapplication

import kotlin.math.abs

fun getLastDigit (number : Int) = abs(number % 10)


/* Do not change code below */
fun main() {
    val a = readln().toInt()
    println(getLastDigit(a))
}