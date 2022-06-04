package com.yijiang.scala._09_FilesAndRegularExpressions

import scala.io.Source

object C_0901_ReadingLines {
  def main(args: Array[String]): Unit = {
    //按行读取文件的内容
    val source = Source.fromFile("bigdata.iml", "UTF-8")
    val lines = source.getLines
//    for(i <- lines) println(i)

    //将获取到的内容转换成数组
    val toArray = source.getLines.toArray
//    for(i <- toArray) println(i)
//    println(toArray.mkString("[",",","]"))

    //将获取到的内容转换成字符串
    val string = source.mkString
    println(string)

    source.close()
  }
}
