package com.example.firstapplication.syntaxTest


fun main() {
    val n = readln().toInt()
    var perfect = 0
    var larger = 0
    var rejection = 0
    repeat(n) {
        val input = readln().toInt()
        when (input) {
            1 -> larger++
            0 -> perfect++
            -1 -> rejection++
        }
    }
    print("$perfect $larger $rejection")
}