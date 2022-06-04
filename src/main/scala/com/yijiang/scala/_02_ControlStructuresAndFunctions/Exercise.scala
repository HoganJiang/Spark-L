package com.yijiang.scala._02_ControlStructuresAndFunctions

object Exercise {
  def main(args: Array[String]): Unit = {
    println(signum(9))
    reverse(10)
  }

  //第一题
  def signum(x:Int) = if (x > 0) 1 else if (x == 0) 0 else 1

  //第二题
  def validateTypeForBraces() = {}

  //第四题
  def reverse(n:Int) = {
    for(i <- 0 to n) println(f"${10 - i}")
  }
}
