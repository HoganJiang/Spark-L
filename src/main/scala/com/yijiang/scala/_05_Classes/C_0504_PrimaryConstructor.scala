package com.yijiang.scala._05_Classes

object C_0504_PrimaryConstructor {
  def main(args: Array[String]): Unit = {
    val p0 = new Person001("Cindy", 19)
    println(p0.description())
  }
}

//初始化构造器的声明形式上表现为紧跟在类名称的后面
class Person001(val name:String, val age:Int){
  //初始化构造器能够执行类中所有的语句（Scala中允许单独的语句出现在类中）
  println("Just construct another person")
  def description(): String ={
    s"$name is $age years old"
  }
}

//初始化构造器中的参数没有被var或者val修饰，且参数至少被类中的一个方法使用时，构造器中的参数是对象私有的，别的对象没有办法访问，访问权限类似private[this]
class Person002(name:String, age:Int){
  println("Just construct another person")
  def description(): String ={
    s"$name is $age years old"
  }

  def communicate(another:Person002): Unit ={
//    println(s" ${another.name} is communicating with ${this.name}.") //value name is not a member of com.yijiang.scala._05_Classes.Person002
  }
}