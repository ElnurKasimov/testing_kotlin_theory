package com.example.testingTheory.lambdaTest

fun someFunction() = (1..100).random()

fun main() {
    val lambda: (Long, Long) -> Long = { a, b ->
            if (a == b)  a
            var res = 1L
            for (i in a..b) {
                res *= i
            }
            res
    }
    println(lambda(2,4))
    println(::someFunction)

}