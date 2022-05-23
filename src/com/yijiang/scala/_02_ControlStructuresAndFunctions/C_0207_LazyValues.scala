package com.yijiang.scala._02_ControlStructuresAndFunctions

object C_0207_LazyValues {
  def main(args: Array[String]): Unit = {
    //lazy value: 表示值的初始化只有在它第一次被调用时才会被加载。
    //这里即使是文件名错误，也不会被检测出来
    lazy val laodFile = scala.io.Source.fromFile("D:\\workspace\\bigdata\\src\\com\\yijiang\\scala\\Person.scalas").mkString
    println(laodFile)
  }
}
