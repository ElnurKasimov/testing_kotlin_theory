package com.example.firstapplication.syntaxTest

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()
    if (h < a) {
        println ("Deficiency")
    } else if (h > b) {
        println("Excess")
    } else {
        println("Normal")
    }
    val range = 100..200
}