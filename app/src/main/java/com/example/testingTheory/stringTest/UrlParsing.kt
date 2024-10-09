package com.example.testingTheory.stringTest

fun main() {
    val url = readln()
    val paramDelimiterIndex = url.indexOf("?")
    val paramString = url.substring(paramDelimiterIndex + 1)
    val parameters = paramString.split("&")
    val containsPassword = paramString.contains("pass")
    var secret = ""
    val fullParameters: Array<List<String>> = Array(parameters.size){List(2){""}}
    for(index in parameters.indices) {
        fullParameters[index] = parameters[index].split("=")
        print("${fullParameters[index][0]} : ")
        if(fullParameters[index][1] == "") {
            println("not found")
        } else {
            println("${fullParameters[index][1]}")
        }
        if(fullParameters[index][0] == "pass" && fullParameters[index][0].isNotEmpty()) {
            secret = fullParameters[index][1]
        }
    }
    if(containsPassword) {
        println("password : $secret")
    }
}