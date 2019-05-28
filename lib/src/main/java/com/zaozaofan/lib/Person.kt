package com.zaozaofan.lib

data class Person(val name: String, val age: Int? = null) //少了好多航代码

fun main(args: Array<String>) {
    val person = listOf(Person("a"), Person("b", 29))   //list数据接口

    val oldest = person.maxBy { it.age ?: 0 }  //不需要自己去实现比较器排序和过滤器.工具类方法.

    println("the oldest is: $oldest")
}



