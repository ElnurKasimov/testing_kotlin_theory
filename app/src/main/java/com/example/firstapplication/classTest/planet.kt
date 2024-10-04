package com.example.firstapplication.classTest

class Planet {
    var star = "Unknown"
    var mass = 1.0
    var numberOfSatellites = 1
}

fun main() {
    val earth = Planet()
    earth.star = "Sun"
    earth.mass = 12312312.2312
    earth.numberOfSatellites = 1
    println("Earth data : star - ${earth.star}, mass - ${earth.mass}, number Of Satellites - ${earth.numberOfSatellites}")
}