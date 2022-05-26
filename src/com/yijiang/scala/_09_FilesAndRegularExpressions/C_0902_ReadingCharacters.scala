package com.yijiang.scala._09_FilesAndRegularExpressions

import scala.io.Source

object C_0902_ReadingCharacters {
  def main(args: Array[String]): Unit = {
    //读取文件中的单个字符
    val source = Source.fromFile("bigdata.iml", "utf-8")
//    for(i <- source) println(i)

    //
    val itr = source.buffered
    while (itr.hasNext){
      if(itr.head.equals("zhangsan")){
          itr.next()
      } else {
        println(itr.head)
      }
    }
    source.close()
  }
}
