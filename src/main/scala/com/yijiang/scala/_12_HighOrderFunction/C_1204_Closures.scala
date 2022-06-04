package com.yijiang.scala._12_HighOrderFunction

object C_1204_Closures {
  def main(args: Array[String]): Unit = {
    //闭包：这里包，我认为指的是作用域，闭包就是有效的作用域。这个作用域可以是包，对象，类，函数。闭包支持函数访问非本地的变量
    val triple = multi(3)
    println(triple(10.0))
  }

  def multi(factor:Double) = (x:Double) => factor * x
}
