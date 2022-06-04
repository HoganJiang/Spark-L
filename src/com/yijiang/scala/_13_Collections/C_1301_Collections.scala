package com.yijiang.scala._13_Collections

object C_1301_Collections {
  def main(args: Array[String]): Unit = {
    //构造各类的集合
    val seq = Seq(1, 10, "String")
    println(seq)

    val strings = Set("HUAWEI", "XiaoMi", "Apple")
    println(strings)

    val maps = Map("Cindy" -> 19, "Wang" -> 20, "Jack" -> 21)
    println(maps)

    //集合之间的相互转化的方法：to[C]
    val set = seq.toSet
    println(set)

    val seq1 = strings.toSeq
    println(seq1)

  }
}
