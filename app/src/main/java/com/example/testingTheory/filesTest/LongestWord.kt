package com.example.testingTheory.filesTest

import java.io.File


fun main() {
    val fileName = "app/src/main/res/words_sequence.txt"
    val file = File(fileName)
    if(file.exists()) {
        val words = file.readLines()
        /*
        var maxLength = words[0].length
        for (word in words) {
            if(word.length > maxLength) maxLength = word.length
         println(maxLength)
        }*/

//        println(words.map{ w -> w.length }.max())

        println(words.maxOfOrNull { it.length })

    } else {
        println("There is no file in the directory")
    }


}
