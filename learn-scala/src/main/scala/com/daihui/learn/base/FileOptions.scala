package scala.com.daihui.learn.base

import scala.io.Source

/**
 * Created by daihui on 2015-10-27.
 */
object FileOptions {

  def main(args: Array[String]) {
//    myFile1()
    myFile2()
  }

  //文件基本操作--读取本地文件
  def myFile1():Unit={
    val file=Source.fromFile("E://MemberInfoInsertController.java")
    for(line<-file.getLines()){
      println(line)
    }
  }


  //读取远程网页内容
  def myFile2():Unit={
    val file=Source.fromURL("http://spark.apache.org/")
    for(line<-file.getLines()) println(line)
  }
}
