package com.yijiang.scala._10_Trait

object C_1001_TraitAsInterfaces {
  def main(args: Array[String]): Unit = {

  }
}

//声明Trait，类似java的interface。方法默认是abstract，且不用abstract修饰
trait Logger {
  def log(msg:String)
}

//Trait的多继承的形式
class ConsoleLogger extends Logger with Serializable with Cloneable{
  override def log(msg: String): Unit = println(msg)
}