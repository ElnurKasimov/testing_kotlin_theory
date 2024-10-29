package com.example.testingTheory.nestedClassesTest

//  Add the member name: String to the class Vehicle and the constructor that takes
//  one argument name: String.
//
//  Inside the class Vehicle create a new inner class Body.
//  The new inner class should have a member color: String,
//  a constructor that takes one argument color: String,
//  and a function fun printColor(), which prints the name of the Vehicle and the color of the Body
//  in the following format: The <name> vehicle has a <color> body.


class Vehicle1 {
    val name: String

    constructor(name: String) {
        this.name = name
    }

    inner class Body(val color: String) {
        fun printColor() {
            println("The $name vehicle has a $color body.")
        }
    }
}

fun main() {
    val vehicle1 = Vehicle1("friend")
    vehicle1.Body("red").printColor()
}