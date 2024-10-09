package com.example.testingTheory.regExpTest

fun main() {
    val regex = """\d{4}-\d{2}-\d{2}""".toRegex() // date template in format YYYY-MM-DD
    val matchResult =
        regex.findAll("Harry was born 1980-07-31 in the Godric's Hollow."
                + "In 1997-12-24, on Christmas Eve, he returned there"
                + "for the legendary Gryffindor sword")
    for (matches in matchResult) println(matches.value)
}