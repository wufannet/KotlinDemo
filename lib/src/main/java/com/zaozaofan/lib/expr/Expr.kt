package com.zaozaofan.lib.expr

//算术表达式求值
interface Expr {
}

class Num(val value: Int): Expr
class Sum(val left:Expr,val right:Expr):Expr
//好像脚本计算,

fun eval(e:Expr):Int{
    if(e is Num){
        val n = e as Num; //no cast needed
        return n.value
    }
    if (e is Sum){
        return eval(e.right)+ eval(e.left) //recursive call 递归,树结构,套娃,组合模式, view,viewGroup
    }
    throw IllegalArgumentException("unknown expression")

}

fun main() {
    println(eval(Sum(Num(1),Num(1))))
}