package com.example.firstapplication.SyntaxTest

// Declare a function to determine age category based on the given age
// Write a function that takes a person's age as input and prints
// 'Minor' if their age is less than 18,
// 'Adult' if their age is greater than or equal to 18 and less than 65,
// and 'Senior' if their age is 65 or above.

fun getStatus(age : Int) : String {
    val status = when {
        age < 18       -> "Minor"
        age in 18..<65 -> "Adult"
        else           -> "Senior"
    }
    return status
}


fun main() {
    // Read the person's age
    val age = readln().toInt()
    println(getStatus(age))
}