package scala.com.daihui.learn.oop

/**
  * Scala多重继承、多重继承构造器执行顺序及AOP实现
  * 470969043@qq.com
  *
  * @author daihui
  * @since 2016-08-25 23:45
  */
object UseTraitAop  extends App {

  //继承测试1
  //trait中可以写具体实现方法，trait可以按照java中接口和抽象类的结合体去理解
  val teacher1 = new PianoTeacher
   teacher1.playPiano()
   teacher1.teach()
  //继承测试2
  //trait中的抽象方法必须得实现
 val teacher2 = new Human with TTeacher with PianoPlayer {
    override def teach() = {
      println("I'm teaching students !")
    }
  }
  teacher2.playPiano()
  teacher2.teach()

  //AOP(切片)测试
  //val worker = new Work with TBeforeAfter
  //worker.doAction()



}
//******************继承*************************
//基类
class Human {
  println("Human Class !")
}

//教师接口
trait TTeacher extends Human{
  println("TTeacher trait !")
  def teach()
}

//钢琴师接口
trait PianoPlayer extends Human{
  println("PianoPlayer trait !")
  def playPiano() = {println("I can play piano !")}
}

class PianoTeacher extends Human with TTeacher with PianoPlayer {
 override def teach() = {println("I'm training students !")}
}
//*******************AOP************************

trait Action {
  def doAction()
}

trait TBeforeAfter extends Action {
  abstract override def doAction(): Unit = {
    println("Initialization !")
    super.doAction()
    println("Destroyed !")
  }
}

class Work extends Action{
  override def doAction() ={
    println("Working !!!")
  }
}


























