package com.example.testingTheory.syntaxTest

fun main() {
    val n = readln().toInt()
    var t1 = 0
    var t2 = 1
    print("$t1, $t2")
    var counter = 2
    while (counter < n) {
        var res = t1 + t2
        print(", $res")
        t1 = t2
        t2 = res
        counter++
    }
}