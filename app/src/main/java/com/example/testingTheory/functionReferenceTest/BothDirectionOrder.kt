package com.example.testingTheory.functionReferenceTest

fun main() {
    val isAscending: Boolean = readln() == "ascending"
    val list: MutableList<Int> = readln().split(' ').map { it.toInt() }.toMutableList()

    val comparator: (Int, Int) -> Int = if(isAscending) Math::min else Math::max
    sort(list, comparator)
    list.forEach { e -> print("$e ") }
}

fun sort(array: MutableList<Int>, comparator: (Int, Int) -> Int) {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (comparator(array[j], array[j + 1]) == array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}