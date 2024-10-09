package com.example.testingTheory.regExpTest

fun getCamelStyleString(inputString: String): String {
    val regex = "_[a-z]".toRegex()
    val intermidiateResult = inputString.replace(regex) {matchResult -> matchResult.value.replace("_", "").uppercase()}
    val result = intermidiateResult.first().uppercase() + intermidiateResult.substring(1)
    return result
}

fun main() {
    val str1 = "A_modern_programming_language_that_makes_developers_happier"
    val str2 = "kjsdhfkjhdsfjhasf_asjdhkj_asdkjh"
    println(getCamelStyleString(str2))
}