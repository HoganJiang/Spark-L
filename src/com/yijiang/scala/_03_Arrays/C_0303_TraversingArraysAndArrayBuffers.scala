package com.yijiang.scala._03_Arrays

object C_0303_TraversingArraysAndArrayBuffers {
  def main(args: Array[String]): Unit = {
    val array = Array("Hello", "World","Welcome","Perfect","Great","Nice","Wonderful")

    //util遍历
    println("-----------------util遍历----------------------")
    for(i <- 0 until array.length) println(s"$i: ${array(i)}")
    for(i <- array.indices) println(s"$i: ${array(i)}")

    //指定步长遍历
    println("-----------------指定步长遍历----------------------")
    for(i <- 0 until array.length by 2) println(s"$i: ${array(i)}")

    //逆序遍历
    println("-----------------逆序遍历----------------------")
    for(i <- 0 until array.length by -1) println(s"$i: ${array(i)}")
    for(i <- array.indices.reverse) println(s"$i: ${array(i)}")

    //增强遍历
    println("-----------------增强遍历----------------------")
    for(i <- array) println(i)

  }
}
