package com.example.testingTheory.regExpTest

fun main() {
    val input = readln()
    val regex = "[aA]+".toRegex()
    println(input.replace(regex, "a"))
}