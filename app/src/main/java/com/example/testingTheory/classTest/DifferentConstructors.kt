package com.example.testingTheory.classTest

class Mug {
    constructor(tea: Tea)
    constructor(coffee: Coffee)
}

enum class Tea: Beverage {GREEN_TEA, LACK_TEA, RED_TEA}

enum class Coffee: Beverage {LIGHT, MEDIUM, STRONG}

class Glass (val beverage: Beverage) {
    fun drink() {
        println("Drinking $beverage")
    }
}

interface Beverage {}


fun main() {
    val mug1 = Mug(Tea.LACK_TEA)
    val mug2 = Mug(Coffee.STRONG)
    val glass1 = Glass(Tea.RED_TEA)
    val glass2 = Glass(Coffee.MEDIUM)
    glass1.drink()
    glass2.drink()
}

