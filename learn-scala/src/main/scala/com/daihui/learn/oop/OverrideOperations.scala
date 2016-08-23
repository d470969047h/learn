package scala.com.daihui.learn.oop

/**
  * 父类构造、重写父类字段和方法
  * 470969043@qq.com
  *
  * @author daihui
  * @since 2016-08-23 23:15
  */
object OverrideOperations {

  def main(args: Array[String]) {
    val worker = new Worker("DaiHui",25,30000)
    println(worker.toString)
    println("school: "+worker.school)
    println("salary: "+"$"+worker.salary)
  }

}


//父类
class Person(val name:String,var age:Int){
  println("The primary constructor of Person !")

  val school = "清华"

  def sleep = "8 hours"

  override def toString = "I am a Person !"
}

//子类
class Worker(name: String,age:Int,val salary:Long) extends Person(name, age){
  println("This is the subClass of Person,primary constructor of Worker !")

  override val school = "哈弗大学"

  override def toString = "I am a Worker,and i sleep "+super.sleep +" every day! "
}