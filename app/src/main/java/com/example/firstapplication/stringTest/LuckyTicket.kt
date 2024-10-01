package com.example.firstapplication.stringTest

fun main() {
    val number = readln()
    val figuresChars = number.toCharArray()
    val figuresInt =  IntArray(6){0}
    for(i in figuresInt.indices) {
        figuresInt[i] = figuresChars[i].digitToInt()
    }
    val isLucky = figuresInt[0] + figuresInt[1] + figuresInt[2] ==
            figuresInt[3] + figuresInt[4] + figuresInt[5]
    if(isLucky) {
        println("Lucky")
    } else {
        println("Regular")
    }
}