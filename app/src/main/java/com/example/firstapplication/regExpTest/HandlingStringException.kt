package com.example.firstapplication.regExpTest

fun main() {
    val index = readln().toInt()
    val word = readln()
    try {
        println(word[index])
    }  catch (e : StringIndexOutOfBoundsException) {
        println("There isn't such an element in the given string, please fix the index!")
    }
}