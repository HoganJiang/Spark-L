package com.yijiang.scala._022_Others

object C_2202_PartialFunction {
  def main(args: Array[String]): Unit = {
    //PartialFunction:指函数接收一个值，返回一个值
    println(pf("Hello"))
    println(pf(20))
    println(pf(19))
  }

  //此处的Any指输入的值的类型，String表示返回值的类型
  def pf:PartialFunction[Any,String] = {
    case "Hello" => "Input string is hello"
    case 19 => "Input integer is 19"
    case _ => "None"
  }
}
