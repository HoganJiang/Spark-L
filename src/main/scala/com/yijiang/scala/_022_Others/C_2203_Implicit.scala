package com.yijiang.scala._022_Others

import java.util

object C_2203_Implicit {
  def main(args: Array[String]): Unit = {
    val linkedList = new util.LinkedList[Int]()
    linkedList.add(1)
    linkedList.add(2)
    linkedList.add(3)

//   linkedList.foreach(println)

//    val value = new TestImpicit(linkedList)
//    value.foreach(println)

//    foreach(linkedList,println)

    //隐式转换方法
//    implicit def xxx(list:util.LinkedList[Int]) = {
//      new TestImpicit(list)
//    }

//    linkedList.foreach(println)

    //隐式转换类
    implicit class TestImpicit[T](list:util.LinkedList[T]){
      def foreach(f:(T) => Unit): Unit ={
        val it = list.iterator()
        while (it.hasNext) f(it.next())
      }
    }

    linkedList.foreach(println)

    //隐式参数:当方法的参数列表中出现implicit关键字时，则意味着其后面的参数在传入的时候，也必须是隐式的参数
    def chat(implicit name:String,age:Int): Unit ={
      println(name + " " + age)
    }

//    implicit val v = "WAT"
    implicit val age = 19

//    chat(v,age)
    chat("GEN",10)


    //柯里化隐式参数: 使用柯里化使得函数既可以接收隐式参数，也可以接受普通参数
    def talking(gender:String)(implicit name:String): Unit ={
      println(gender + " " + name)
    }

    implicit val name = "HHH"
    val gen = "male"
    talking(gen)

  }


}

//class TestImpicit[T](list:util.LinkedList[T]){
//  def foreach(f:(T) => Unit): Unit ={
//    val it = list.iterator()
//    while (it.hasNext) f(it.next())
//  }
//}
