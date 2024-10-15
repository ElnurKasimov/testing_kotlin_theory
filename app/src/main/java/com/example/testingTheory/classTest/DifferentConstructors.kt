package com.example.testingTheory.classTest

class Mug {
    constructor(tea: Tea)
    constructor(coffee: Coffee)
}

enum class Tea {GREEN_TEA, LACK_TEA, RED_TEA}
enum class Coffee {LIGHT, MEDIUM, STRONG}

fun main() {
    val mug1 = Mug(Tea.LACK_TEA)
    val mug2 = Mug(Coffee.STRONG)
}

