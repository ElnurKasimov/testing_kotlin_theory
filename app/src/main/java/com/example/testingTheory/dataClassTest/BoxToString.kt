package com.example.testingTheory.dataClassTest

data class Box(val height: Int, val length: Int, val width: Int) {
    val size: Int = height + length + width
    override fun toString(): String {
        return "Box(height=$height, width=$width, size=$size)"
    }
}

fun main() {
    val (height, length, width) = readln().split(" ")

    val box1 = Box(height.toInt(), length.toInt(), width.toInt())

    println(box1)

}