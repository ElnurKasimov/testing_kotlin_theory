package com.example.testingTheory.jetPackComposeTest

//import java.awt.Color


fun printARGB() {
    val validRange = 0..255
    val (alfa,red,green,blue) = readln().split(" ").map{ it.toInt()}
    if (alfa in validRange && red in validRange && green in validRange && blue in validRange ) {
//        val newColor = Color(alfa, red, green, blue)
//        println(newColor.rgb.toUInt())
    } else {
        println("Invalid input")
    }
}

fun main() {
    printARGB()
}