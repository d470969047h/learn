package scala.com.daihui.learn.base

/**
 * Created by daihui on 2015-10-27.
 */
object TupleOps {

   def main (args: Array[String]) {
    tuple()
  }

  //funciton 1
  def tuple():Unit={
    val a=(20,"java","scala","spark")
    println(a._1)
    println(a._2)
    println(a._3)
    println(a._4)
  }
}
