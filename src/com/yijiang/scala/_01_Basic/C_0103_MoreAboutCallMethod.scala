package com.yijiang.scala._01_Basic

object C_0103_MoreAboutCallMethod {
  def main(args: Array[String]): Unit = {
    //1. 一般方法调用
    val str = "Hello".intersect("World")
    println(str)

    //2. 当方法只有一个参数时，可以省略括号
    val sortedStr = "Bonj".sorted
    println(sortedStr)
  }
}
