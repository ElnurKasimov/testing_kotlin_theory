package com.example.testingTheory.nestedClassesTest

//Let's create a simple class with a nested object. There is a box of blocks for kids.
// All of them are the same size but their colors can be different.
// We will store these objects in a class Block with one property color and
// a nested object BlockProperties with properties length and width.
// Your task is to create this structure!
//
//In addition, your nested object should have a blocksInBox() function
// that receives the length and width (parameters order is important) of a box
// and returns the number of blocks this box can store.
//
//Make the properties of a nested object mutable for the validation system!
// You may initialize them with any numbers, for example, 6 and 4. as in the example.
// Don't worry about heights, solve it like a 2D problem. Don't rotate the blocks.



class Block(color: String) {
    companion object BlockProperties {
        var length: Int = 0
        var width: Int = 0
        fun blocksInBox(lengthBox: Int, widthBox: Int): Int {
            val lengthNumber = lengthBox / length
            val widthNumber = widthBox / width
            return lengthNumber * widthNumber
        }
    }
}

fun main() {
    val num1 = 4.5f
    val num2 = 45L
    val res = num1 + num2
    val block = Block("red")
    Block.BlockProperties.length = 6
    Block.BlockProperties.width = 4
    println(Block.BlockProperties.blocksInBox(32, 25))

}