package com.yijiang.scala._06_Objects

object C_0601_SingletonAndCompanionObject {
  def main(args: Array[String]): Unit = {
    println(Accounts.newUniqueNumber)
  }
}


class Accounts{
  private var balance = 0.0;
  val id = Accounts.newUniqueNumber
  def deposit(amt:Double) = {balance += amt}
}

//
object Accounts{
  private var lastNumber = 0
  def newUniqueNumber() = {lastNumber += 1; lastNumber}
}

