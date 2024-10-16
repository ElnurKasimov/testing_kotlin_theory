package com.example.testingTheory.filesTest

import java.io.File


fun main() {
    val fileName = "app/src/main/res/reading.txt"
    val file = File(fileName)
    if(file.exists()) {
        val lines = file.readText()
        print(lines)
    } else {
        println("There is no file in the directory")
    }


}
