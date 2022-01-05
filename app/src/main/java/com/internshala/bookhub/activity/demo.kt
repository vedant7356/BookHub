package com.internshala.bookhub.activity

fun coffee() {
    //COFFEE DETAILS......................................
    val mon = Coffee(0, 120, 10)
    val tue = Coffee(0, 120, 10)
    val wed = Coffee(5, 120, 5)
    val thu = Coffee(5, 120, 5)
    val fri = Coffee(5, 120, 5)
    val sat = Coffee(5, 120, 5)
    val sun = Coffee(25, 120, 5)

    println("Your mon coffee with ${mon.milkAmount}% milk and ${mon.sugarAmount}gm of sugar is ready at ${mon.temp}°C.")
    println("Your tue coffee with ${tue.milkAmount}% milk and ${tue.sugarAmount}gm of sugar is ready at ${tue.temp}°C.")
    println("Your wed coffee with ${wed.milkAmount}% milk and ${wed.sugarAmount}gm of sugar is ready at ${wed.temp}°C.")
    println("Your thu coffee with ${thu.milkAmount}% milk and ${thu.sugarAmount}gm of sugar is ready at ${thu.temp}°C.")
    println("Your fri coffee with ${fri.milkAmount}% milk and ${fri.sugarAmount}gm of sugar is ready at ${fri.temp}°C.")
    println("Your sat coffee with ${sat.milkAmount}% milk and ${sat.sugarAmount}gm of sugar is ready at ${sat.temp}°C.")
    println("Your sun coffee with ${sun.milkAmount}% milk and ${sun.sugarAmount}gm of sugar is ready at ${sun.temp}°C.")
}

data class Coffee(var milkAmount: Int, var temp: Int, var sugarAmount: Int) {}

fun main() {

    coffee()                       //The variable "mon" gives an error because it is declared in the "coffee" function
}
