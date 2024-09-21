package com.example.firstapplication.ListTest


fun main() {
    val booksToRead = listOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery"
    )
    booksToRead.forEach{b -> println(b)}
    println("--------------------------------")
    val sortedBooks = booksToRead
        .map{b -> b.removePrefix("The ")}
        .sorted()
    sortedBooks.forEach(::println)
    println("--------------------------------")
    val filteredBooks  = sortedBooks.filter { b ->
        b.contains("Mystery")
    }
    println("Filtered list - $filteredBooks")
    val mutableFilteredBooks = filteredBooks.toMutableList()
    mutableFilteredBooks.add("At Midnight or Later")
    mutableFilteredBooks.add("At Midnight or Later")
    println("--------------------------------")
    println("Amended filtered list - $mutableFilteredBooks")
    val setBooks = mutableFilteredBooks.toSet()
    println("--------------------------------")
    println("Set of books - $setBooks")

}