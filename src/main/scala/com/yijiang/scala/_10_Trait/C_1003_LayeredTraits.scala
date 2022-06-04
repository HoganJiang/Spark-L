package com.yijiang.scala._10_Trait

object C_1003_LayeredTraits {
  def main(args: Array[String]): Unit = {

  }
}

trait ConsoleLogger02 extends Logger {
  override def log(msg: String): Unit = {
//    super.log(s"${java.time.Instant.now()} $msg")
  }
}

trait ShortLogger extends Logger {
  override def log(msg: String): Unit = {
//    super.log(if(msg.length > 15) msg else s"${msg.substring(0,12)}")
  }
}
