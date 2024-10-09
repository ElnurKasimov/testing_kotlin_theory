package com.example.testingTheory.regExpTest

fun main() {
    val text = readln()
    val regexColors = "#[0-9a-fA-F]{6}\\b".toRegex()
    val matchResult = regexColors.findAll(text)
    for(match in matchResult ) {
        println(match.value)
    }
}