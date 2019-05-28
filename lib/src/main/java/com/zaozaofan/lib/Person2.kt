package com.zaozaofan.lib

class Person2(s: String, b: Boolean) {
    val name: String = ""
    var isMarried: Boolean = false

}

class Rectangle(val height: Int,val width: Int){
    val isSquare: Boolean
        get() = height == width

}

fun main() {
    val person = Person2("b",true)
    person.isMarried = false //直接使用属性,不需要getter

    val rectangle = Rectangle(1,1)
    println("is square "+rectangle.isSquare)

}

