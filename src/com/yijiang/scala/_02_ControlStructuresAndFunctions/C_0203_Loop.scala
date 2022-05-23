package com.yijiang.scala._02_ControlStructuresAndFunctions

object C_0203_Loop {
  def main(args: Array[String]): Unit = {
    val str = "Hello"
    var sum = 0
    //for循环迭代字符串中的每个元素
    for(i <- 0 to str.length - 1) {
      sum += str(i)
      println(sum)
    }

    for(i <- "Hello") {
      sum += i
      println(sum)
    }

    //嵌套循环
    for(i <- 1 to 4; j <- 1 to 5) print(s"$i * $j = ${i * j}\n")

    //if守卫
    for(i <- 1 to 4; j <- 1 to 5 if i != j) print(s"$i * $j = ${i * j}\n")

    //yield转换
    val col = for(i <- 1 to 10) yield i % 3
    print(col)

    //外层for循环后面可以定义变量，供内层for循环使用
    for(i <- 1 to 4; form = 5 - i; j <- form to 4) print(s"${j} \t")

    //while
    var n = 0
    while(n < 10){
      print{s"$n"}
      n+=1
    }
  }

}
