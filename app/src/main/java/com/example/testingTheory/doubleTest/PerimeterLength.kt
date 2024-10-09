package com.example.testingTheory.doubleTest

import kotlin.math.hypot

fun perimeter(x1: Double, y1: Double,
              x2: Double, y2: Double,
              x3: Double, y3: Double,
              x4: Double = x3, y4: Double = y3): Double {
    val edge1 = hypot((x2 - x1), (y2 - y1))
    val edge2 = hypot((x3 - x2), (y3 - y2))
    val edge3 = hypot((x4 - x3), (y4 - y3))
    val edge4 = hypot((x1 - x4), (y1 - y4))
    return edge1 + edge2 + edge3 + edge4
}

fun main() {
    val input = readln().split(" ")
    val numbs = mutableListOf<Double>()
    for(str in input) (
        numbs.add(str.toDouble())
    )

    if(numbs.size == 6) {
        val perim = perimeter(numbs[0], numbs[1], numbs[2], numbs[3], numbs[4], numbs[5])
        println(perim)
    } else {
        val perim = perimeter(numbs[0], numbs[1], numbs[2], numbs[3], numbs[4], numbs[5], numbs[6], numbs[7])
        println(perim)
    }
}