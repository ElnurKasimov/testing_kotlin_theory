package com.example.firstapplication.lambdaTest



fun main() {
    val originalPredicate: (Char) -> Boolean = {it.isLowerCase()}
//    val notPredicate: (Char) -> Boolean = {c -> !originalPredicate(c)}
    val notPredicate: (Char) -> Boolean = {!originalPredicate(it)}
    println("originalPredicate : ${originalPredicate('C')}")
    println("notPredicate : ${notPredicate('C')}")
}