package com.example.firstapplication

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    fun circumference() = 2 * pi * radius
}

fun main() {
    print("enter radius : ")
    val radius = readln().toDouble()
    val smallCircle = Circle(radius)
    println("""For circle 
        |with radius ${smallCircle.radius}
        |circumference is equal ${smallCircle.circumference()}
        """.trimMargin())
}