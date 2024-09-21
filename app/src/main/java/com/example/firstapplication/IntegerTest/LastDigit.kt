package com.example.firstapplication.IntegerTest

import kotlin.math.abs

fun getLastDigit (number : Int) = abs(number % 10)

fun isRightEquation(a : Int, b : Int, c : Int) = (a * b) == c

/* Do not change code below */
fun main() {
    val aa = readln().toInt()
    println(getLastDigit(aa))

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(isRightEquation(a, b, c))
}
