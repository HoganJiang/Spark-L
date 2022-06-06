package com.yijiang.spark

import org.apache.spark.{SparkConf, SparkContext}

object S_01_API {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("API")
    val sc = new SparkContext(conf)

    //create an RDD
    val srcRDD = sc.parallelize(List(9, 10, 7, 9, 10, 8))

    //transformation: map,flatmap, filter
    val tansforRDD = srcRDD.filter(_ > 9)

    //action: collect
    val ans = tansforRDD.collect()

//    ans.foreach(println)

    //需求一：去除RDD中重复的元素，不允许使用Spark提供的API算子
    val distinctRDD = srcRDD.map((_, 1)).reduceByKey(_ + _).map(_._1)
//    distinctRDD.foreach(println)

    //需求二：去除RDD中重复的元素，使用Spark提供的API算子
    val res = srcRDD.distinct()
//    res.foreach(println)

    //需求三：合并两个RDD。
    val srcRDD2 = sc.parallelize(List(10, 8, 10, 8))
    val unionRDD = srcRDD2.union(srcRDD)
//    unionRDD.foreach(println)

    //需求四：求两个RDD的交集
    val intersectRDD = srcRDD.intersection(srcRDD2)
//    intersectRDD.foreach(println)

    //需求五：求两个RDD的差集
    val subtractRDD = srcRDD.subtract(srcRDD2)
//    subtractRDD.foreach(println)

    //需求六：求两个RDD的笛卡尔积。由于不需要区分不同物理机中内存中的分区中的每条记录归属那条分区，也就是不需要partitioner，因此也就需要shuffler
    val cartesianRDD = srcRDD.cartesian(srcRDD2)
    cartesianRDD.foreach(println)

    val src3RDD = sc.parallelize(List(("zs", 20), ("ls", 21), ("ww", 19), ("zs", 18), ("ww", 17), ("zs", 20)))
    val src4RDD = sc.parallelize(List(("zs", 18), ("zl", 13), ("zs", 17)))

    //需求七：演示cogroup的用法
    val cogroupRDD = src3RDD.cogroup(src4RDD)
//    cogroupRDD.foreach(println)

    //需求八：求两个RDD的join的结果
    val joinRDD = src3RDD.join(src4RDD)
//    joinRDD.foreach(println)

    //需求九：两个RDD左外关联
    val leftOuterJoinRDD = src3RDD.leftOuterJoin(src4RDD)
    leftOuterJoinRDD.foreach(println)

    //需求十：两个RDD右外关联
    val rightOuterJoinRDD = src3RDD.rightOuterJoin(src4RDD)
    rightOuterJoinRDD.foreach(println)

    //需求十一：两个RDD全外关联
    val fullOuterJoinRDD = src3RDD.fullOuterJoin(src4RDD)
    fullOuterJoinRDD.foreach(println)




  }
}
