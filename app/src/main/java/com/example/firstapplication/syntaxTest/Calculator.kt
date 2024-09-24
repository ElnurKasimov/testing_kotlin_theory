package com.example.firstapplication.syntaxTest

fun main(){
    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+", "plus" -> println(a + b)
        "-", "minus", -> println(a - b) // trailing comma
        "*", "times" -> println(a * b)
        else -> println("Unknown operator")
    }
}