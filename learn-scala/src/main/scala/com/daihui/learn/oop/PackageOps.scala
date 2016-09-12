package scala.com.daihui.learn.oop

//起别名
import java.util.{HashMap=>javaHashMap}
/**
 * Created by daihui on 16-9-12.
 */

package daihui.pack{

}
class PackageOps {}

//直接使用包对象中的变量、方法等。。
package object daihui1{
  val NAME = "A"
  val AGE = "12"
  def myprint = println("包对象里的方法！")
}
package  daihui1{
  class daihui1{
    var name  = NAME
    myprint
  }

}

package daihui.scala{
  abstract class Action{
    def act
  }

  package spark{
    class MyAction extends Action{
      override def act = println("Action...")
    }
  }


}