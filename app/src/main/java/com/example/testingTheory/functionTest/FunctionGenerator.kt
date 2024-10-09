package com.example.testingTheory.functionTest

fun generate(functionName: String): (Int) -> Int {
    return when(functionName) {
            "identity" -> { x -> x }
            "half" -> { x -> x / 2 }
            else -> { _ -> 0 }
    }
}


fun main() {
    val q: (String) -> (Int) -> Int = ::generate
    val x = q("plus")
    println(x(54))
}