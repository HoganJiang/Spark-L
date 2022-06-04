package com.yijiang.scala._06_Objects

abstract class UndoableAction(val description:String) {
  def undo()
  def redo()
}
