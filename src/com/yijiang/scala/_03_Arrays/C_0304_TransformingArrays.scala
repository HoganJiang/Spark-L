package com.yijiang.scala._03_Arrays

object C_0304_TransformingArrays {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(9,8,3,10)

    //一个Array转换成另外一个新的Array
    val arr2 = for(i <- arr1) yield i * 3

    //转换时可以用if守卫或者函数编程
    val arr3 = for(i <- arr1 if i > 9) yield i * 2
    val arr4 = arr1.filter(x => x > 10).map(_ * 2)

  }
}
