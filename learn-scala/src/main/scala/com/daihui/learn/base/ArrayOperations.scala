package scala.com.daihui.learn.base

/**
 * Created by daihui on 2015-10-27.
 */
object ArrayOperations {

  def main(args: Array[String]) {
//    myArray1()
    myArray2()
//    myArray3()
  }

  //普通循环
  def myArray1():Unit={
    val array=Array(1,2,3,4,5)
    for(index<-0.until(array.length)){
      println(array(index))
    }
  }

  //高级循环
  def myArray2():Unit={
    val array=Array(1,9,8,7.6,5)
    for(item<-array) println(item)

  }

//  def myArray3():Unit={
////    val array=Array()
//    for (index<-0.until(10)){
//      print(array(index))
//    }
//  }
}
