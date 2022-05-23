package com.yijiang.scala._02_ControlStructuresAndFunctions

object C_0204_Functions {
  def main(args: Array[String]): Unit = {
    val a = abs(-19)
    println(a)

    val b = fac(10)
    println(b)
  }

  //定义一个函数：参数类型需要指定值，且只要不是递归函数，都可以不使用return关键字
  def abs(x:Double) = if(x >= 0) x else -x

  //如果有多个表达式，则将其包含在{}内，代码块中最后一个表达式为函数的返回值
  def fac1(n:Int) = {
    var r = 1
    for(i <- 1 to n) r = r * i
    r
  }

  //递归函数的返回需要用return关键字
  def fac(n:Int):Int = if(n <= 0)  1 else n * fac(n - 1)
}
