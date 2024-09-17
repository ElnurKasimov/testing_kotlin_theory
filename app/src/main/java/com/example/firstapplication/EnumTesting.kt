package com.example.firstapplication

enum class Colour(val saturation : Double) {
    RED(80.4),
    GREEN(16.5),
    WHITE(100.0);

    val hue = "middle"

    fun isBrighter(threshold : Double) = saturation > threshold
}


 fun main () {
     println("green has such hue - ${Colour.GREEN.hue}")
     print("enter saturation threshold for white colour: ")
     val threshold = readln().toDouble()
     println("is white brighter than ${threshold}? - ${Colour.RED.isBrighter(threshold)}")
     println("green colour  is ${Colour.GREEN.ordinal} in the enum")
     print("select colour : ")
     val colour = readln()
     val certainColour = Colour.valueOf(colour)
     println("""$colour 
         |has name ${certainColour.name} and 
         |has ordinal number ${certainColour.ordinal}"""
         .trimMargin())
 }
