package com.yijiang.spark

import org.apache.spark.{SparkConf, SparkContext}

object S_03_Aggregator {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("aggregator").setMaster("local")
    val sc = new SparkContext(conf)

    //需求一：用groupByKey将相同的key进行分组
    val srcRDD = sc.parallelize(List(("zs", 100), ("zs", 50),("zs", 1000),("lisi", 40), ("lisi", 30), ("ww", 21),("ww", 25),("ww", 30)))
    val groupByKeyRdd = srcRDD.groupByKey()
//    groupByKeyRdd.foreach(println)

    //需求二：对分组的数据进行行转列
//    val values = groupByKeyRdd.flatMap(ele => ele._2.map(x => (ele._1, x)))
    val values = groupByKeyRdd.flatMapValues(itr => itr.iterator)
//    values.foreach(println)

    //需求三：对分组的数据取前三
    val ans = groupByKeyRdd.mapValues(e => e.toList.sorted.take(2))
    ans.foreach(println)



  }
}
