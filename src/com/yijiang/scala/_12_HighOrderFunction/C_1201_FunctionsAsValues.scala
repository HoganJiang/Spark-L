package com.yijiang.scala._12_HighOrderFunction

import scala.math._

object C_1201_FunctionsAsValues {
  def main(args: Array[String]): Unit = {
    //1、函数的定义，从技术的角度看，形如f:Double => Double的类型即为函数，函数由输入，=> 与输出，与方法不同的是，方法
    //的类型行如(Double)Double，没有=>

    //2、方法转化为函数
    //2.1 包对象中的方法转化为函数
    val doubleToDouble = ceil _
    val d = doubleToDouble(20.1)
    println(d)

    //2.2 类中的方法转化为函数
    val str = "Hello Wold"
    val at = (_:String).charAt(_:Int)
    println(at(str,3))

    //3、函数被当成是参数传递
    //(x:Int) => x * 10 为匿名函数
    val ints = Array(29, 10, 19).map((x: Int) => x * 10)
    println(ints.mkString("[",",","]"))
  }
}
