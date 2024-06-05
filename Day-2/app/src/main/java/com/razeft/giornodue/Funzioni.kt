package com.razeft.giornodue

var name = "Joan"
fun main() {
    greetings()
    name = "Micheal"
    greetings()
    println("--------------")
    greetingsConParams("Alex")
    greetingsConParams("Razeft")
    greetingsConParams("Sarah")

    val somma = sumTwoNumbers(10)
    val sommaValori = sumTwoNumbers(10, 20)

    println("Somma: $somma")
    println("Somma valori: $sommaValori")
}

fun greetings(){
    println("Hello $name")
}

fun greetingsConParams(name: String) {
    println("Hola $name")
}

fun sumTwoNumbers(x: Int, y: Int = 0): Int{
    return x + y
}