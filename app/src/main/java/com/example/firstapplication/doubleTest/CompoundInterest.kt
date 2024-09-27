package com.example.firstapplication.doubleTest

import kotlin.math.pow

fun main() {
    val argName = readln()
    val argValue = readln().toInt()
    when (argName) {
        "amount" -> calculate(amount = argValue)
        "percent" -> calculate(percent = argValue)
        "years" -> calculate(years = argValue)
        else -> println("Unknown argument name: $argName")
    }
}

fun calculate(amount: Int = 1000, percent: Int = 5, years: Int = 10) {
    val res = amount * ( (1 + percent.toDouble() / 100).pow(years.toDouble()) )
    println(res.toInt())
}