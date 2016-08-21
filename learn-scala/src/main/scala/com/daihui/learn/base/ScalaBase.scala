package scala.com.daihui.learn.base

import java.io.File

/**
 * Created by daihui on 2015-10-27.
 */
object ScalaBase {

  def main(args:Array[String]):Unit={

//    var file =if(!args.isEmpty) args(0) else "scala.xml"
//    print(file)

//    println(if(!args.isEmpty) args(0) else "java.xml")

//    for(i<-1.to(10)){
//      println("Num is:"+i)
//    }

//    val files=(new File(".")).listFiles()
//    for(file<-files){
//      println(file)
//    }

//    val n=99
//    try {
//      val half=if(n % 2==0) n/2 else throw
//        new RuntimeException("N must be event")
//    }catch {
//      case e:Exception=>println("The exception is:"+e.getMessage)
//    }finally {
//    }

  }


  //function 1
  def doWhile(): Unit ={
    var line=""
        do{
          line=readLine()
            println("Read:"+line)
        }while(line!="")
  }


  //function 2
  def looper(x:Long,y:Long):Long={
    var a=x
    var b=y
    while (a!=0){
      val temp=a
      a=b%a
      b=temp
    }
    b
  }

  //function 3


}
