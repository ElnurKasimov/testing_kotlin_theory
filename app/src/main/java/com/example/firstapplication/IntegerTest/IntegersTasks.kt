package com.example.firstapplication.IntegerTest

fun getDeskQuantity (pupils : Int ) : Int {
    val result = when {
        pupils % 2 == 0 -> pupils / 2
        else -> (pupils / 2) + 1
    }
    return result
}

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val deskA = getDeskQuantity(a)
    val deskB = getDeskQuantity(b)
    val deskC = getDeskQuantity(c)
    println(deskA + deskB + deskC)
}