package scala.com.daihui.learn.oop

/**
 * Created by daihui on 2015-11-28.
 */
//class Teacher {
//
//  var name :String = _
//  private var age=25
//  private[this] val gender="man"//只属于当前实例
//
//  def this(name:String){
//    this  // 或者this()
//    this.age=24
//    this.name="daihui"
//  }
//
//  def hello(): Unit ={
//    println(this.name+": "+this.age+" "+this.gender)
//  }
//}



class Teacher(val name:String,var age:Int){
  println("有参数的类")
  println(name+age)
  var sex:String=_

  def this(name:String,age:Int,sex:String){
  this(name,age)
    this.sex=sex
  }

  def teacher = new Teacher("dh",25)
  teacher.age = 20
  println(teacher.age)
}


class Student(){
  var age=2
}
object OOPInAction{

  def main (args: Array[String]) {
//    val tea=new Teacher
//    tea.name="daihui"
//    tea.hello


    val s=new Student()
    s.age  =1
    println(s.age)

    new Teacher("daihui1",1);
//    val tea2 =new Teacher("dd",222,"dddad")
//    print(tea2.name+tea2.age+tea2.sex)
//    val teacher  =new Teacher()
//    teacher.name = "daihui"
//    teacher.hello()
  }
}
