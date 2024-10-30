package com.example.testingTheory.nestedClassesTest

class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var counter = 0
        fun create(name: String): Player {
            counter++
            return Player(counter, name, 100)
        }
    }
}

fun main() {
    val pl1 = Player.create("John")
    val pl2 = Player.create("James")
    println(Player.counter)
}