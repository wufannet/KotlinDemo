package ch03.ex4_2_Varargs

fun main(args: Array<String>) {
    val args1 = arrayOf("1","2")
    println(args.javaClass) //class [Ljava.lang.String;
    val list = listOf("args: ", *args,*args1) //class java.util.Arrays$ArrayList
//    println(list.javaClass)
//    println(list)

    val map = mutableMapOf(1 to "one",2 to "two")
//    println(map.javaClass) //class java.util.LinkedHashMap
    map[1] ="one1"
    println((1 to "one").javaClass) //Pair (1, one) class kotlin.Pair
//    public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that) A.扩展方法 //泛型的扩展方法


    val (number,name) = 1 to "one"
    println(number)
    println(name)
    //简单的对象,pair,可以of创建,复杂的还是要先创建,再add

}
