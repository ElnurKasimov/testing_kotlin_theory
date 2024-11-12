package com.example.testingTheory.filesTest

import java.io.File


fun main() {
    val fileName = "app/src/main/res/words_sequence.txt"
    val file = File(fileName)
    if(file.exists()) {
        val words = file.readLines()
        println(words.maxOfOrNull { it.length })

//        val words = file.readText().split("\\W+".toRegex())
//        println(words.count())



    } else {
        println("There is no file in the directory")
    }


}
