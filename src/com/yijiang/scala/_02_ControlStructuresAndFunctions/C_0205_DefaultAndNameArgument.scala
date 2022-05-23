package com.yijiang.scala._02_ControlStructuresAndFunctions

object C_0205_DefaultAndNameArgument {
  def main(args: Array[String]): Unit = {
    //使用默认值
    val ans1 = decorate("Hello")
    println(ans1)

    //为默认值指定新的值
    val ans2 = decorate("Hello","<<<",">>>")
    println(ans2)

    //使用命名的参数时，可以不用按照参数的顺序赋值
    val ans3 = decorate(left = "<<<", str = "Hello", right = ">>>")
    println(ans3)
  }

  //函数默认值的一般形式
  def decorate(str:String, left:String = "[",right:String = "]") = left + str + right
}
