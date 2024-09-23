package com.example.firstapplication.SyntaxTest

fun main() {
//    val n = readln().toInt()
//    var number = readln().toInt()
//    var min = number
//    for (i in 2..n) {
//        number = readln().toInt()
//        if(number < min) {
//            min = number
//        }
//    }
//    println(min)
    val n = readln().toInt()
    var number : Int
    var sum = 0
    for (i in 1..n) {
        number = readln().toInt()
        sum+=number
    }
    println(sum)
    for (i = 0; i < 10; i++) {

    }

}