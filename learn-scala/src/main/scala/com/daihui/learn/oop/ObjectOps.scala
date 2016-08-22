package scala.com.daihui.learn.oop

/**
  * 单例对象，伴生对象
  * 470969043@qq.com
  *
  * @author daihui
  * @create 2016-08-22 23:34
  */
object ObjectOps {

  def main(args: Array[String]) {
    println(Student.newStuID)
    println(Student.newStuID)
  }



  class Student{
    val id = Student.newStuID
    private  var stuNo = 0
    def aClass(stuNo:Int){this.stuNo += stuNo}
  }

  object Student{
    var stuID = 0
    def newStuID={
      stuID += 1
      stuID
    }
  }




}
