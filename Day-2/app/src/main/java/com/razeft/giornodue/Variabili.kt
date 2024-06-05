package com.razeft.giornodue

fun main() {
    val x: Int = 20

    val result = x + 10
    println("result: $result")

    val resto = 4 % 3
    println("Resto: $resto")

    val what_type = 10 + 2.5
    println("What type: ${(what_type::class.simpleName)}")

    val want_int: Int = 10 + 2.5.toInt()
    println("want an int: $want_int")

    println("result $x + 10 = ${x + 10}")
}