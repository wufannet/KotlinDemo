package com.zaozaofan.lib

import java.lang.Exception

//enum class, 自带当前类型常量的类.
enum class Color (val r:Int, val g:Int, var b:Int){ //属性
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255);  //分号分开 枚举常量列表和方法定义

    fun rgb()  = (r*256 +g)*256+b //方法
}

fun main() {
    println(Color.BLUE.rgb())
    println(getMnemonic(Color.RED)) //kotlin.Unit
}

fun getMnemonic(color: Color){
    when(color){
        Color.RED -> "rrr"
        Color.GREEN -> "gggg"
        Color.BLUE -> "bbbb"
        else -> throw Exception("dirty color")
    }
}