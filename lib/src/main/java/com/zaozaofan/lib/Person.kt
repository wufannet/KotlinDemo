package com.zaozaofan.lib

import kotlin.String as String1

data class Person(val name: String1, val age: Int? = null) //少了好多代码,不过也没什么卵用,本来已经是通过json自动生成bean类了.

fun main(args: Array<String1>) {
    val person = listOf(Person("a"), Person("b", 29))   //list数据接口
    // Null can not be a value of a non-null type String

    val oldest = person.maxBy { it.age ?: 0 }  //不需要自己去实现比较器排序和过滤器.工具类方法.
//    oldest.age =1;
    //Val cannot be reassigned
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type Person?

    println("the oldest is: $oldest")

    test()

}


