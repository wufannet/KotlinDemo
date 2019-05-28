package com.zaozaofan.lib

fun main(args: Array<String>) {
////    println("Hello, world!")
//
//    println(max(1,2))

    println("$")
    println("\$x")
}

//fun main() {
//    val v = maxExpLess(2,3)
//    println(v)
//    var i: Int
//    i = 42
//    i =1
//
//    var answer = 42;
//}

//2.1.2 函数 表达式函数体,代码块函数体
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxExp(a: Int, b: Int): Int = if (a > b) a else b

fun maxExpLess(a: Int, b: Int) = if (a > b) a else b