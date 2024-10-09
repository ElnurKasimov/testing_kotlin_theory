package com.example.testingTheory.regExpTest

fun main() {
    val report = readln()
    val regEx = Regex(" wrong answers?")
    println(regEx.matchesAt(report, 1))
}