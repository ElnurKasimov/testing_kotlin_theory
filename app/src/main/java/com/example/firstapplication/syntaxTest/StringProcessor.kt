package com.example.firstapplication.syntaxTest

fun main() {
    val s1 = readln()
    val operator = readln()
    val s2 = readln()
    println ( when (operator) {
            "equals" -> {
                if (s1==s2) "true" else "false"
            }
            "plus" -> s1 + s2
            "endsWith" -> {
                if (s1.endsWith(s2)) "true" else "false"
            }
            else -> "Unknown operation"
        }
    )
}

