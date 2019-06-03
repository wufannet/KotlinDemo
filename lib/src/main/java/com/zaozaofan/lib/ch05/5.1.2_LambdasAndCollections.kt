package ch05.ex1_2_LambdasAndCollections

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) { //抽象这一行实现,别的封装到库函数maxBy,  T it -> Comparable
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
//    findTheOldest(people)
//    println(people.maxBy { it.age }) //库函数, 函数参数,指定那一个值来找到最大元素 person.age 的抽象 //省去参数,只有函数体
    //public inline fun <T, R : Comparable<R>> Iterable<T>.maxBy(selector: (T) -> R): T? {
    //<T, R : Comparable<R>>
    //好多符号,泛型,可读性变差.  :?, <>
    //参数是T -> R的函数 也就是参数是t,返回值是r的函数, 不在乎在那个类,函数名. 只在乎函数实现和函数定义. T->R的函数
    //一个参数时,it是默认形参名字.

//    println(people.maxBy (Person::age )) //成员引用
//    val t= test() //函数赋值给变量,函数参数,都能直接调用,但是无法传值函数 //会调勇函数
//    t //不会调用
//    val get ={ println("get")} //lambda参数
//    get() //会调用
//    get //不会调用
//    println("t")
//    t
//    get
//    run { println("run") }
//    run (::test) //成员引用,顶层函数 ,小括号  //() -> R 无参数,返回任意类型,泛型R
//    run(get) //lambda参数可以直接传给函数圆括号
//    run{get}
//    run{t} //函数参数可以传给lambda括号内
//    println(get.javaClass) //class ch05.ex1_2_LambdasAndCollections._5_1_2_LambdasAndCollectionsKt$main$get$1
//    println(t.javaClass) //class kotlin.Unit

    //lambda 变量和函数 变量使用上还不一样,有点混, 成员引用代替lambda,类属性,方法,是小括号.


    //保存成员流函数,延期执行
    val testVal = ::test  //函数成员引用, 能做函数参数,代替调用该函数的lambda参数  //函数
    testVal()
}

fun test(){
    println("1")
}

//方法签名包含方法名,参数列表, 不包含返回值
//fun  test(): String{
//    println("1")
//}

