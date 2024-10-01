package com.example.firstapplication.stringTest

fun  isPalindrome(text: String): Boolean {
    for (i in 0 until text.length / 2) {
        if(text[i] != text[text.length - 1 - i]) {
            return false
        }
    }
    return true
}

fun main() {
    val text = readln()
    println(isPalindrome(text))
}