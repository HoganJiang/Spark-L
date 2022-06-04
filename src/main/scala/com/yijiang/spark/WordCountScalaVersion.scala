package com.yijiang.spark

import org.apache.spark.{SparkConf, SparkContext}

object WordCountScalaVersion {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("WordCount").setMaster("local")

    val context = new SparkContext(conf)

    val fileRDD = context.textFile(this.getClass.getClassLoader.getResource("./data/testFile.txt").getPath)

    val word = fileRDD.flatMap((x: String) => x.split(" "))

    val pairWord = word.map((x: String) => new Tuple2(x, 1))

    val resPair = pairWord.reduceByKey((oldValue: Int, newValue: Int) => oldValue + newValue)

    resPair.foreach(println)

  }
}
