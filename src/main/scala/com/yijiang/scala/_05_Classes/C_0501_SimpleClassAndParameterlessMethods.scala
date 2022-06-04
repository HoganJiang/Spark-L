package com.yijiang.scala._05_Classes

object C_0501_SimpleClassAndParameterlessMethods {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment
    println(myCounter.current)
  }
}


class Counter {
  private var value  = 0
  def increment() = value += 1
  def current() = value
}