package com.yijiang.scala._01_Basic

object C_0104_ApplyMethod {
  def main(args: Array[String]): Unit = {
    val s = "Hello"
    //s(2) = s.apply(2)
    val c1 = s(2)
    val c2 = s.apply(2)
    println(c1 + " " + c2)
  }
}
