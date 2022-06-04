package com.yijiang.scala._04_MapsAndTuples

object C_0402_Tuples {
  def main(args: Array[String]): Unit = {
    //申请Tuple
    val tuple = (1, 3.14, "Fred", true)

    //访问tuple中的元素，Tuple中的元素的开始索引为1不是0
    println(tuple._1)

    //zipping
    val symbol = Array("<","-","-")
    val count = Array(2,3,7)
    val tuples = symbol.zip(count)
//    for(i <- tuples) println(i)
    for((s,c) <- tuples) println(s * c)
  }
}
