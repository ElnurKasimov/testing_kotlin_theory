package com.example.firstapplication.regExpTest

fun main() {
    val text = readln()
    val regEx = Regex(".*Computer.*")
    println(if(regEx.matches(text)) "true" else "false")
}