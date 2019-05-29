package com.zaozaofan.lib.ch03

val UNIX_1 ="1"
const val UNIX_2="2"

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(ch03.JoinToString.joinToString(list, separator = "; ", prefix = "(", postfix = ")")) //命名参数


}
