package ch03.ex5_1_1_SplittingStrings

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex())) //[12, 345, 6, A]  \\. 相当于 . 特殊字符标记为原字符

    println("12.345-6.A".split(".","-"))
}
