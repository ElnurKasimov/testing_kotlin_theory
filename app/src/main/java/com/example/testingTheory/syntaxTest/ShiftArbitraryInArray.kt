package com.example.testingTheory.syntaxTest

fun main() {
    val n = readln().toInt()
    val numbers : MutableList<Int> = mutableListOf()
    for(i in 1..n) {
        numbers.add(readln().toInt())
    }
    val shift = readln().toInt()
    val realShift = shift % n
    for(i in 0 until n) {
        if (n - realShift + i < n) {
            print("${numbers[n - realShift + i]} ")

        } else {
            print("${numbers[i - realShift]} ")
        }
    }
    println()
    val num = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (index in num.lastIndex downTo 0 step 2) {
        println("$index: ${num[index]}")
    }
}