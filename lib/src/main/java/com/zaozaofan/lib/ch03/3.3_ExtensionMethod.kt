package com.zaozaofan.lib.ch03

fun String.lastChar():Char = this.get(this.length-1)
fun String.lastChar1():Char = get(length-1)
fun String.lastChar2():Char = this[length-1]

val String.lastChar:Char
    get() = get(length-1)

fun main() {
    println("abc".lastChar())
    println("kotlin".lastChar1())
    println("kotlin".lastChar)
    println("kotlin".last())
}