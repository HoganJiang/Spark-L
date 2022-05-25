package com.yijiang.scala._03_Arrays

object C_0306_MultidimensionalArrays {
  def main(args: Array[String]): Unit = {
    //初始化二维数组
    val array = Array.ofDim[Double](3, 4)
    array(2)(3) = 20

    //访问二位数组中的元素
    println(array(2)(3))

    //初始化一个固定行，列随机的二维数组
    val triangle = new Array[Array[Int]](10)
    for(i <- triangle.indices) triangle(i) = new Array[Int](i + 1)

    for(i <- triangle) println(i.mkString("[",",","]"))

  }
}
