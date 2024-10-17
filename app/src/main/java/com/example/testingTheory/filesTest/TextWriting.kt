package com.example.testingTheory.filesTest

import java.io.File

fun main() {
    val fileName = "app/src/main/res/writing.txt"
    val file = File(fileName)
    val text = "It is awfully hard work doing nothing!"
    file.writeText(text)
    val workingDirectory = System.getProperty ("user.dir")
    println(workingDirectory)
    val separator = File.separator
    println("separator = $separator")
    println(listOf("tea", "coffee"))
    println("Crumpet" to "tea")
}