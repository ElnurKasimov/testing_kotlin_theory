package com.example.testingTheory.functionTest

fun sum(a: Int, b: Int): Int = a + b

fun sayHello() {
    println("Hello")
}

fun main() {
    val sumObject = ::sum
    println(sumObject(10,109))
}