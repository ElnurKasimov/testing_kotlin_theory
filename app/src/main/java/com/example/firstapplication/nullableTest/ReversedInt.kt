package com.example.firstapplication.nullableTest

fun reverse(input: Int?): Int {
    val result: Int? = input?.toString()?.reversed()?.toInt()
    return  result ?: -1
}

fun main() {
    val input: Int? = null
    println(reverse(input))
}