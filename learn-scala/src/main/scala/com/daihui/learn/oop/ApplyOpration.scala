package scala.com.daihui.learn.oop

/**
  * apply()方法在object和class中的运用
  * 470969043@qq.com
  *
  * @author daihui
  * @since 2016-08-23 0:08
  */
object ApplyOpration extends App{

  val a = new People
  a.haveTry
  println(a.apply)

//  def main(args: Array[String]) {
//
//    //类声明实例
//    val people1 = new People()
////    people1.apply
//    people1.haveTry
//
//
//    //伴生对象声明实例
////    val people2 = People()
//   // people2.apply
////    people2.haveTry
//  }

}


//object中使用
object People {
  def apply() = {
    println("apply() in People object !")
    new People
  }
}

class People {
  def apply = println("apply() in People class !")

  def haveTry{
    println("Have a try on apply !")
  }
}