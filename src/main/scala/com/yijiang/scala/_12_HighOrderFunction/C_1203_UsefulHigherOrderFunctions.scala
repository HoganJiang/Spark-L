package com.yijiang.scala._12_HighOrderFunction

object C_1203_UsefulHigherOrderFunctions {
  def main(args: Array[String]): Unit = {
    //使用Map
    val ints = (1 to 10).map(3 * _)
    println(ints)

    //打印用”*“的三角形
    (1 to 9).map("*" * _).foreach(println _)

    //filter
    (1 to 9).filter(_ % 2 == 0).foreach(println)

    //reduceLeft
    println((1 to 3).reduceLeft(_ * _))

    //sortWith
    "She is so cool and beauty".split(" ").sortWith(_.length > _.length).foreach(println _)


  }
}
