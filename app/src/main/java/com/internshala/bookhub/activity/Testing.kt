package com.internshala.bookhub.activity

class Person(var firstname : String , var lastname : String )

{

    fun greeting()

    {

        println("Hello ${firstname} ${lastname} , welcome to Internshala Trainings !")

    }

}

fun main()

{

    val p1 = Person("Zayn","Malik")

    p1.greeting()

}