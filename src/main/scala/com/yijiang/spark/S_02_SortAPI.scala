package com.yijiang.spark

import org.apache.spark.{SparkConf, SparkContext}

object S_02_SortAPI {
  def main(args: Array[String]): Unit = {
    val spConf = new SparkConf().setMaster("local").setAppName("sortAPI")
    val sc = new SparkContext(spConf)
    sc.setLogLevel("ERROR")

    val srcRDD = sc.textFile(this.getClass.getClassLoader.getResource("data/pvuvdata").getPath,5)

    println("-------------------pv---------------------------")
    //43.169.217.152	河北	2018-11-12	1542011088714	3292380437528494072	www.dangdang.com	Login
    val pvPair = srcRDD.map(line => (line.split("\t")(5), 1))
    val reducePvPair = pvPair.reduceByKey(_ + _)
    val swapPvPair = reducePvPair.map(_.swap)
    val sortPvPair = swapPvPair.sortByKey(false)
    val swapAgainPair = sortPvPair.map(_.swap)
    val array = swapAgainPair.take(5)
    array.foreach(println)

    println("-------------------uv---------------------------")
    val uvPair = srcRDD.map(line => {
      val str = line.split("\t")
      (str(0), str(5))
    }).distinct.map(pair => (pair._2, 1)).reduceByKey(_ + _).sortBy(_._2, false)
    val uv = uvPair.take(5)
    uv.foreach(println)

    while (true){}

  }
}
