package com.example.testingTheory.lambdaTest

fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int  = {g(h(it))}