package com.yijiang.scala._03_Arrays

import scala.collection.mutable.ArrayBuffer

object C_0305_CommonAlgorithms {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,10,7,9)

    //生成新的数组并指定元素间的分隔符
    println(arr.mkString(","))

    //生产新的数组指定元素间的分隔符以及数组的前后缀
    println(arr.mkString("[",",","]"))

    //求和
    println(arr.sum)

    //求最大值
    println(arr.max)

    //求最小值
    println(arr.min)

    //排序
    println(arr.sorted.mkString("[",",","]"))
    println(arr.sortWith(_ > _).mkString("[",",","]"))

    //求满足条件的个数
    println(arr.count(_ % 2 == 0))

    //追加新的数组
    val arrayBuffer = ArrayBuffer(1, 2)
    arrayBuffer.append(2,3,19)
    println(arrayBuffer.mkString)

    //追加一个集合
    arrayBuffer.appendAll(1 to 10)
    println(arrayBuffer.mkString("[",",","]"))

    //测试是否包含某个切片，切片需有序
    println(arrayBuffer.containsSlice(0 to 1))

    //拷贝可变数组到不可
    println("------------------------------")
//    arrayBuffer.copyToArray(arr)
    arrayBuffer.copyToArray(arr)
    println(arrayBuffer.mkString("[",",","]"))
    println(arr.mkString("[",",","]"))



  }
}
