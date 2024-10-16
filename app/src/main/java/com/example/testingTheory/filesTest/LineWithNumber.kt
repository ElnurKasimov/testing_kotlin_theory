package com.example.testingTheory.filesTest

import java.io.File


fun main() {
    val fileName = "app/src/main/res/words_with_numbers.txt"
    val file = File(fileName)
    if(file.exists()) {
        val lines = file.readLines()
        var counter = 0
        val regEx = Regex(".*[0-9].*")
        for (line in lines) {
            if(line.matches(regEx)) counter++
        }
        println(counter)
    } else {
        println("There is no file in the directory")
    }


}
