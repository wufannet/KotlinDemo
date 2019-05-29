package com.zaozaofan.lib

import java.util.*

fun fizzBuzz(i:Int) = when{
    i %15 ==0 -> "FizzBuzz"
    i%3 == 0 ->"Fizz"
    i%5 == 0 ->"Buzz"
    else ->"$i"
}

fun main() {
//    for(i in 1..100){
//        println(fizzBuzz(i))
//    }

//    for(i in 100 downTo 1 step 2){
//        println(fizzBuzz(i))
//    }

//    for(i in 0 until 10){
//        println(i)
//    }


//    val binaryReps = TreeMap<Char,String>()
//
//    for(c in 'A'..'F'){
//        val binary = Integer.toBinaryString(c.toInt())
//        binaryReps[c] = binary
//    }
//
//    for((letter, binary) in binaryReps){
//        println("$letter = $binary")
//    }
    //1000001
    //省去了map entrySet的转换

    //展开语法 迭代集合同时跟踪下标
    val list = arrayListOf("10","11","12")
    for((index,element) in list.withIndex()){
        println("$index: $element")
    }

}