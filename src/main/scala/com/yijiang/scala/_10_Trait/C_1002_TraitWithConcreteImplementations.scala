package com.yijiang.scala._10_Trait

object C_1002_TraitWithConcreteImplementations {
  def main(args: Array[String]): Unit = {

  }
}

//trait的方法可以有自己的默认实现，与java接口中default方法等同
trait ConsoleLogger01 {
  def log(msg:String) = println(msg)
}

class Account {

}

class SavingAccount extends Account with ConsoleLogger01 {
  
}