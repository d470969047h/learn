package scala.com.daihui.learn.oop

/**
  * scala中作为借口的trait，在对象中混入trait
  * 470969043@qq.com
  *
  * @author daihui
  * @since 2016-08-24 0:29
  */
object UseTrait extends App{

  //1.调用实现了trait的类的方法
//  val logger1 = new LoggerImpl
//  logger1.myLog()

  //2.调用继承了抽象类兵实现了trait的类的方法,且调用trait2方法
  val logger2 = new myAccount
  logger2.accountPrint()
  logger2.loged("trait logs !")

}

//声明trait
trait Logger{
  //抽象方法
  def log(msg : String)
}


//实现Logger，重写log方法
class LoggerImpl extends Logger{
  override def log(msg:String) = println("Log: "+msg)
    def myLog(){
    log("It's me !!")
  }
}

//子trait，重写log方法
trait subTrait1 extends Logger{
  override def log(msg:String): Unit = {
    println("subTrait1 log is: "+msg)
  }
}

//定义trait，但是该trait有具体实现方法
trait subTrait2{
  def loged(msg:String): Unit ={
    println("subTrait2 log is: "+msg)
  }
}

//抽象类
abstract class Account{
  def accountPrint()
}

//子类集成抽象类并实现trait,重写抽象类方法和trait方法
class myAccount extends Account with subTrait1 with subTrait2{
  override def accountPrint(): Unit = {
     log("This is my account !")
  }
  override def log(msg :String){
    println("the log of myAccount: " +msg)
  }
}





