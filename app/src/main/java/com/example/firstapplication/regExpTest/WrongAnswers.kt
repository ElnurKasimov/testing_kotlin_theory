package com.example.firstapplication.regExpTest

fun main() {
    val report = readln()
    val regEx = Regex(" wrong answers?")
    println(regEx.matchesAt(report, 1))
}