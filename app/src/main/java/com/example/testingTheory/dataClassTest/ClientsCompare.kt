package com.example.testingTheory.dataClassTest

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other !is Client) false  else  (this.name == other.name) && (this.age == other.age)
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val name1 = readln()
    val age1 = readln().toInt()
    val balance1 = readln().toInt()
    val name2 = readln()
    val age2 = readln().toInt()
    val balance2 = readln().toInt()
    val client1 = Client(name1, age1, balance1)
    val client2 = Client(name2, age2, balance2)
    println(client1 == client2)
}