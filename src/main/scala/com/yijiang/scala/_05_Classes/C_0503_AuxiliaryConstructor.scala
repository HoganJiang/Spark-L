package com.yijiang.scala._05_Classes

object C_0503_AuxiliaryConstructor {
  def main(args: Array[String]): Unit = {
    val p1 = new Person
    val p2 = new Person("zhangsan")
    val p3 = new Person(19,"lisi")
  }
}

class Person {
  private var age = 0
  private var name = " "

  //辅助构造器是以this(parameter:Type)的形式使用
  //辅助构造器可以有多个，每定义一个新的辅助构造器，需先调用前一个构造器
  def this(name:String){
    this() //先调用primary constructor
    this.name = name
  }

  def this(age:Int, name:String){
    this(name)
    this.age = age
  }
}
