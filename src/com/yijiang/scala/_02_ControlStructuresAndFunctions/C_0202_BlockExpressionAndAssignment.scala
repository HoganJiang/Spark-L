package com.yijiang.scala._02_ControlStructuresAndFunctions

import scala.math.sqrt

object C_0202_BlockExpressionAndAssignment {
  def main(args: Array[String]): Unit = {
    val x = 10
    val x0 = 2
    val y = 5
    val y0 = 3
    //块表达式的返回值是最后一个表达式，且没有return语句
    val distance = {val dx = x - x0; val dy = y - y0; sqrt(dx * dx + dy * dy)}
    println(distance)

    //块表达式的中的最后一个表达式若是一个赋值语句，则表示该块表达式没有返回值，Scala中没有返回值用Unit表示
    val len = {val dx = x - x0; val dy = y - y0;}
    println(len)

    //Scala的持链式赋值得到值是Unit，因为赋值的返回值是Unit
    var b = 10
    val a = b = 11;
    println(a)
  }
}
