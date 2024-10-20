package com.example.testingTheory.collectionsList

fun main() {
    val list1 = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    val list2 = list1.subList(1,6)
    println(list1 === list2)
}