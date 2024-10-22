package com.example.testingTheory.nestedClassesTest

class Pumpkin(val type: String, val isForHalloween: Boolean) {

    fun addCandle() {
        if(isForHalloween) {
            val candle = Candle().burning()
        } else {
            println("We don't need a candle.")
        }
    }

    inner class Candle {
        fun burning() {
            println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
        }
    }
}

fun main() {
    val pumpkinForHalloween = Pumpkin("common", true)
    val pumpkinNotForHalloween = Pumpkin("common", false)
    pumpkinForHalloween.addCandle()
    pumpkinNotForHalloween.addCandle()
}