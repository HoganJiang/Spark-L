package com.yijiang.scala._02_ControlStructuresAndFunctions

object C_0206_VariableArguments {
  def main(args: Array[String]): Unit = {
    //调用带可变参数的函数
    val ans = sum(1, 9, 20, 10)
    println(ans)
  }

  //声明形参为可变参数的函数
  def sum(n:Int*): Int ={
    var result = 0
    for(i <- n) result += i
    result
  }
}
