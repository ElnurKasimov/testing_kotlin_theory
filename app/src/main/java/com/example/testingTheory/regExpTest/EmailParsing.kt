package com.example.testingTheory.regExpTest

fun parsingNickname(emailString: String): String {
    val symbolsForNickname = Regex("[._]") // fix this condition
    val nicknameString = emailString.split("@").first() // fix this condition
    val (firstName, lastName ) = nicknameString.split(symbolsForNickname)
    val nickname = firstName.first().uppercase() + firstName.substring(1) + " " +
            lastName.first().uppercase() + lastName.substring(1)
    return nickname
}

fun main() {
    val email = "jon.kirbi@gmail.com"
    println("email : $email")
    println("nickname : ${parsingNickname(email)}")
}