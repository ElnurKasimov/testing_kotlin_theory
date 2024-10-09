package com.example.testingTheory.stringTest


fun main() {
    val(text, index) = readln().split(" ")
    val indexInt = index.toInt()
    println("---------------------   solution with substring  -----------------")
    if(indexInt > text.length) {
        println(text)
    } else {
        val str1 = text.substring(0, indexInt)
        val str2 = text.substring(indexInt)
        println(str2 + str1)
    }
    println("---------------------   solution without substring  -----------------")
    val changedText = if(indexInt > text.length) {
        text
    } else {
        text.drop(indexInt) + text.take(indexInt)
    }
    println(changedText)
}