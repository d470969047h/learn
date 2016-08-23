package scala.com.daihui.learn.oop

/**
  * 抽象类、抽象字段、抽象方法
  * 470969043@qq.com
  *
  * @author daihui
  * @since 2016-08-23 23:47
  */
object AbstractClassOps {

  def main(args: Array[String]) {
    val teacher = new TeacherForMaths("Spark")
    teacher.teach //方法调用
    println("teacher id : " + teacher.id)
    println("teacher age : " + teacher.age)

  }
}

//一般类
class myClass {
  // var 声明的变量可变，可以用“_”占位符代替具体赋值
  var id1: Int = _
  // var 声明的变量，直接赋具体的值
  var id2: Int = 10
  // val 声明的变量，只可用具体的值赋值，因为其不可变
  val id3: Int = 20
}


//抽象类,变量只声明未赋值，方法只定义未实现
abstract class SupperTeacher(val name: String) {
  var id: Int
  var age: Int
  val work: String

  def teach
}

//具体子类,实现具体方法，并给字段赋值
class TeacherForMaths(name: String) extends SupperTeacher(name) {
  override var id: Int = name.hashCode

  override def teach: Unit = println("The teacher of " + work)

  override val work: String = "teach " + name
  override var age: Int = 25
}