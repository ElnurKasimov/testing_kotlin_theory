package com.example.testingTheory.syntaxTest

class Expressions {

}

fun main () {
    val a = 10
    val b = 5
    val c = 20
    val exp = (a + b > c) && ((a - b) < c)
    println(exp)
}