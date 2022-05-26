package com.yijiang.scala._09_FilesAndRegularExpressions

import scala.io.Source

object C_0903_ReadingTokensAndNumbers {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("test.txt", "utf-8")

    //读取文件中的内容，并按照空格拆分
    val tokens = source.mkString.split("\\s+")
    println(tokens.mkString("[",",","]"))


  }
}
