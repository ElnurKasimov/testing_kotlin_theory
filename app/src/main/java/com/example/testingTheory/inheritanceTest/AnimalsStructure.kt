package com.example.testingTheory.inheritanceTest

open class Animal(val weight: Int, val age: Int)

open class Mammal(weight: Int,  age: Int) : Animal(weight, age)
class Lion(weight: Int,  age: Int) : Mammal(weight, age)


open class Fish(weight: Int,  age: Int) : Animal(weight, age)
class Salmon(weight: Int,  age: Int) : Fish(weight, age)
class Carp(weight: Int,  age: Int) : Fish(weight, age)

open class Bird(weight: Int,  age: Int) : Animal(weight, age)
class Eagle(weight: Int,  age: Int) : Bird(weight, age)

