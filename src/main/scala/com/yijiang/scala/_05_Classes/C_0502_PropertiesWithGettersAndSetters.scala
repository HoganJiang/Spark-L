package com.yijiang.scala._05_Classes

object C_0502_PropertiesWithGettersAndSetters {
  def main(args: Array[String]): Unit = {
    //调用默认的getter方法与setter方法
    val person = new Person01
    person.age = 10 //setter

    val p = new Person01
    p.age = 11
    println(p.age)
    println(person.age) //getter

    val person02 = new Person02
//    person02.gender = "male" //由于gender是val类型，因此只有getter方法，没有setter方法
    println(person02.gender)

    val person03 = new Person03
    person03.age = 15
    println(person03.age)

  }
}

class Person01 {
  //声明成员变量age,编译器为其自动生成getter方法和setter方法，且是私有的
  //scala中getter的形式为age,setter的形式为age_
  var age = 0
}

class Person02 {
  //控制不让scala为每一个成员属性都生成getter与setter方法
  //1.声明成员变量为val类型时，此时就只有的getter方法
  val gender = "man"

  //2.成员变量被private修饰时，此时getter与setter方法都是私有的
  private var age = 10

  //3.如果不想拥有getter和setter方法，就可以使用private[this]
  private[this] var name = "zhangsan"

}

//自定义getter与setter方法
class Person03 {
  private var privateAge = 10

  //自定义getter
  def age = privateAge

  //自定义setter
  def age_=(newAge:Int) = {
    if(newAge > privateAge) privateAge = newAge
  }

}