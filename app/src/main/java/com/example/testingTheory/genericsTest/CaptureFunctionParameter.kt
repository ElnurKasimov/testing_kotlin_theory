package com.example.testingTheory.genericsTest

interface Beverage {
    val isAlcohol: Boolean

}

class Tea() : Beverage {
    override val isAlcohol: Boolean
        get() = false

    override fun toString(): String {
        return "tea, which is " + if(isAlcohol) "" else "not " + "alcohol"
    }
}

class Rom : Beverage {
    override val isAlcohol: Boolean
        get() = true

    override fun toString(): String {
        return "rom, which is " + (if(isAlcohol) "" else "not ") + "alcohol"
    }
}

fun serve(beverage: Beverage): Mug<Beverage> {
    return Mug(beverage)
}

fun <T : Beverage> getInstance(beverage : T): Mug<T> {
    return Mug(beverage)
}

class Mug<T: Beverage> (val beverage: T) {
    val volume : Int
        get() = 100

    fun drink () {
        println("Drinking $beverage from a ${volume}ml mug")
    }

}


fun main() {
    val tea = Tea()
    val rom = Rom()
    val mug1 = serve(tea)
    val mug2 = serve(rom)
    val mug3 = getInstance(tea)
    val mug4 = getInstance(rom)
    mug1.drink()
    mug4.drink()

}