package com.yijiang.scala._01_Basic

import java.math.BigInteger

object C_0102_CommonUsedType {
  def main(args: Array[String]): Unit = {
    //数字1在scala中是一个对象
    val range = 1.to(10)
    println(range)

    //String隐式转换成了StringOps
    val strings = "Hello World".intersect("World")
    println(strings)

  }
}
