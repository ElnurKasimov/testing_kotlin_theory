package com.example.testingTheory.syntaxTest

fun main() {
    val n = readln().toInt()
    val a : MutableList<Int> = mutableListOf()
    for(i in 1..n) {
        a.add(readln().toInt())
    }
    for(i in 0 until n) {
        if (n - 1 + i < n) {
            print("${a[n - 1 + i]} ")

        } else {
            print("${a[i - 1]} ")
        }
    }
}