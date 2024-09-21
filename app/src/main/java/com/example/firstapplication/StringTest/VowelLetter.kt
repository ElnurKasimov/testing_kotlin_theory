package com.example.firstapplication.StringTest

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
    val result = (letter.isDigit() and (letter != '0')) or (letter.isLetter() and letter.isUpperCase())
    println(result)
}