package com.yijiang.scala._03_Arrays

object C_0301_FixLengthArrays {
  def main(args: Array[String]): Unit = {
    //声明固定长度数组的几种形式
    val nums = new Array[Int](10) //长度固定为10，所有的数值被初始化为0
    val str = new Array[String](2) //长度固定为2， 所有的字符串被初始化为null
    val s = Array("Hello","World") //指定数组的值，但不用使用关键字new

    //访问数组的元素
    println(s(1))
  }
}
