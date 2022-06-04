package com.yijiang.scala._022_Others

object C_2201_Match {
  def main(args: Array[String]): Unit = {
    val thatGirl = ("beautiful", 26.0, 175, true)

    //获取迭代器，迭代器中有操作元素的各类方法
    val iterator = thatGirl.productIterator

    val units = iterator.map(x => {
      x match {
        case "beautiful" => println("That girl is beautiful")
        case 26.0 => println("she is 26 years old,")
        case height: Int if height > 170 => println("she is tall")
        case _ => println("others is also important.")
      }
    })

    while (units.hasNext) println(units.next)
  }
}



