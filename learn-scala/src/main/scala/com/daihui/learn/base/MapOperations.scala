package scala.com.daihui.learn.base

/**
 * Created by daihui on 2015-10-27.
 */
object MapOperations {

  def main(args: Array[String]) {
//    myMap1()
    myMap2()
  }

  //Map操作1
  def myMap1():Unit={
    val ages=Map("daihui"->25,"wangyanhong"->23)
    for((k,v)<-ages){
      println("Key is "+k+",value is "+v)
    }

  }

  //Map操作2
  def myMap2():Unit={
    val ages=Map("daihui"->25,"wangyanhong"->23,"mayun"->48)
    for((k,_)<-ages)println("Key is "+ k)
  }

}
