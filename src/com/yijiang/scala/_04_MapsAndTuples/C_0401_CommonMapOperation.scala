package com.yijiang.scala._04_MapsAndTuples

import scala.collection.{SortedMap, mutable}

object C_0401_CommonMapOperation {
  def main(args: Array[String]): Unit = {
    //创建不可变的Map
    val scores = Map("Alice" -> 10, "Bob" -> 9,"Cindy" -> 7)

    //创建可变的Map
    val mutScores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 9, "Cindy" -> 7)

    //创建Map的另一种形式
    val imScores = Map(("Alice", 10), ("Bob", 9), ("Cindy", 7))

    //访问Map
    //1.通过key获取value
    val value = scores("Alice")
    println(value)

    //2.访问key但没有对应的value处理方式
    val i = scores.getOrElse("Bob", 11)
    println(i)

    //更新Map
    //1、更新可变map的值，如果这个值不存在，则添加新的值
    mutScores("Bob") = 10

    //2、添加多个值，若相应的key存在，则对其进行更新，否则添加新的值
    mutScores += ("Bob" -> 20, "Findy" -> 25)

    //3、更新不可变Map，会得到一个新的Map
    val s = scores + ("Bob" -> 10,"Fred" -> 7)

    //删除
    mutScores -= "Alice"

    //迭代Map
    for((k,v) <- mutScores) println(s"$k : $v\t")

    //迭代Key
    print(mutScores.keySet.mkString("[",",","]"))

    //迭代Values
    print(mutScores.values.mkString("[",",","]"))

    //反转Map
    val newMutScores = for((k,v) <- mutScores) yield (v,k)
    for((k,v) <- newMutScores) println(s"$k : $v\t")

    //SortedMap:申请排好序的Map
    val sortedMap = SortedMap("Bob" -> 10, "Alice" -> 9, "Kind" -> 7)
    for((k,v) <- sortedMap) print(s"$k : $v\t")

    println()

    //LinkedHashMap:按照插入的顺序排好序的Map
    val linkedHashMap = mutable.LinkedHashMap("Bob" -> 10, "Alice" -> 9, "Kind" -> 7)
    for((k,v) <- linkedHashMap) print(s"$k : $v\t")

  }
}
