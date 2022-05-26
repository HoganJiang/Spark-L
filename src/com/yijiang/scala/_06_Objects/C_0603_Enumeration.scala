package com.yijiang.scala._06_Objects

object C_0603_Enumeration {
  def main(args: Array[String]): Unit = {
    //访问枚举类的值
    val color = TrafficLightColor01.Red
    println(color)

    //根据ID访问值
    val result = TrafficLightColor02.Red
    println(TrafficLightColor02(0))
    println(TrafficLightColor02.withName("go"))
  }
}

object TrafficLightColor01 extends Enumeration{
  val Red,Yellow,Green = Value
}

object TrafficLightColor02 extends Enumeration {
  //指定ID或者值
  val Red = Value(0,"Stop")
  val Yellow = Value(10)
  val Green = Value("go")
}