package com.yijiang.scala._03_Arrays

import scala.collection.mutable.ArrayBuffer

object C_0302_VariableLengthArrays {
  def main(args: Array[String]): Unit = {
    //声明一个可变长度数组
    val ab = new ArrayBuffer[Int]()

    //追加一个值
    ab += 1

    //追加多个值
    ab += (1,2,9)

    //追加一个集合
    ab ++= Array(8,9,10)

    //删除最后2个位置的值
    ab.trimEnd(2)

    println(ab)

    //在指定的位置插入一个值
    ab.insert(2,19)

    //在指定的位置插入多个值
    ab.insert(4,22,90,100)

    //删除指定位置的值
    ab.remove(2)

    //删除从指定位置开始值，元素的个数是2
    ab.remove(3,2)

    println(ab)

    //可变数组转化为不可变数组
    val toArray = ab.toArray
    for(i <- toArray) print(i)

    //不可变数组转化为可变数组
    val buffer = toArray.toBuffer
    println(buffer)


  }
}
