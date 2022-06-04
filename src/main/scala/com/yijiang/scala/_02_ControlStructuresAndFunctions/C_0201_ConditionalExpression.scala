package com.yijiang.scala._02_ControlStructuresAndFunctions

object C_0201_ConditionalExpression {
  def main(args: Array[String]): Unit = {
    //if/else语句可以返回一个值，但不用写return关键
    val x = 10
    val value = if (x > 10) 1 else 0
    println(value)

    //返回值可以是不同的类型，但可以他们都有共同的父类Any
    val ans = if (x > 10) "great" else 0
    println(ans)

    //如果没有返回值，则用()代替
    val res = if(x > 10) "1" else ()
    println(res)
  }
}
