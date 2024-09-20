package com.example.firstapplication

fun isVowel ( letter : Char) : Boolean {
    val result = when (letter.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
    return result
}

fun main() {
    val letter = readln().first()
    println(isVowel(letter))
}