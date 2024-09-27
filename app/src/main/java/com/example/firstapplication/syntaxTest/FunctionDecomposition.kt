package com.example.firstapplication.syntaxTest

fun validatePassword(password: String): Boolean {
    val validationResult = password.length > 4
    if (!validationResult) {
        println("Your password should be five or longer characters, please write a new password")
    } else {
        println("Good password")
    }
    return validationResult
}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}