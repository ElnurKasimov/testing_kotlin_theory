package com.example.firstapplication.stringTest

import java.util.Scanner   // Required for reading user input.

fun main(args: Array<String>) {
    // Create a scanner object for reading user input.
    val scanner = Scanner(System.`in`)

    // Read a line of input from the user.
    val inputString = scanner.nextLine()

    for(i in inputString.indices) {
        print(inputString[inputString.lastIndex - i])
    }
    println()
}