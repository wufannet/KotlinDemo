//@file:JvmName("CreatingCollectionsInKotlin.kt")
package com.zaozaofan.lib.ch03

val set = hashSetOf(1,2,3)
val list = arrayListOf(1,2,3)
val map = hashMapOf(1 to "one",2 to "two",3 to "three")
val list1 = listOf(1,2,3)

fun main() {
    println(set)
    println(set.javaClass)
    println(list)
    println(list.javaClass)
    println(map)
    println(map.javaClass) //class java.util.Arrays$ArrayList


    println(list1.javaClass)
}