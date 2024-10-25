package com.example.testingTheory.extensionFunctionTest

fun main() {
//    fun singleQuotes(original: String) = "'$original'"

    fun String.singleQuotes(): String = "'$this'"
}