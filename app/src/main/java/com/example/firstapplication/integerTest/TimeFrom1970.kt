package com.example.firstapplication.integerTest

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000
    val seconds = totalSeconds % 60
    val totalMinutes = totalSeconds / 60
    val minutes = totalMinutes % 60
    val totalHours = totalMinutes / 60
    val hours = totalHours % 24
    println("${hours}:${minutes}:${seconds}")
}