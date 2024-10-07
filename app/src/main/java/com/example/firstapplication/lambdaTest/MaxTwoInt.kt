package com.example.firstapplication.lambdaTest

fun maxTwoInt(a: Int, b: Int): Int {
     return if(a>=b) a else b
}
fun main() {
    val lambda: (a: Int, b: Int) -> (Int) = {
        a, b -> if(a>=b) a else b
    }

    println(lambda(3, 5))
    println((::maxTwoInt)(3, 5))

}