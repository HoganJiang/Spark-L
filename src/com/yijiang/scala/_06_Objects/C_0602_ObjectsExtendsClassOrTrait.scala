package com.yijiang.scala._06_Objects

object C_0602_ObjectsExtendsClassOrTrait {
  def main(args: Array[String]): Unit = {
    val m = Map("open" -> DoNothingAction,"save" -> DoNothingAction)
    println( m("open").redo())
  }
}

object DoNothingAction extends UndoableAction("DoNothing"){
  override def undo(): Unit = {}
  override def redo(): Unit = {}
}