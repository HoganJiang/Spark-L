package com.yijiang.scala._03_Arrays

object Exercise {

  def main(args: Array[String]): Unit = {
    val arr = Array(2,9,10)
    val a = null
    val array = swapAdjacentEleOfArray(arr)
    println(array.mkString("[",",","]"))
  }

  //第一题
  def swapAdjacentEleOfArray(arr:Array[Int]): Array[Int] = {
    if (arr == null || arr.length == 0) None
    if(arr.length == 1) arr else {
      for(i <- 0 until arr.length by 2 if i != arr.length - 1) {
        var tmp = arr(i)
        arr(i) = arr(i+1)
        arr(i+1) = tmp
      }
      arr
    }
  }
}
