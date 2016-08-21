package scala.com.daihui.learn.oop

/**
  * 内部类和外部类
  * 内部类隶属于外部类的实例，这与java不同
  * outer 为Outer的别名，可以将其看做为实例
  * 470969043@qq.com
  *
  * @author daihui
  * @since 2016-08-21 23:49
  */
class Outer(val name:String) { outer =>
  class Inner(val name:String) {
      def foo(inner:Inner) = println("Outer: "+outer.name + " Inner: "+inner.name)
  }
}

object OOPInScala{
  def main(args: Array[String]) {
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")

    val inner1 = new outer1.Inner("Scala")
    val inner2 = new outer2.Inner("Java")

    inner1.foo(inner1)
    inner2.foo(inner2)
  }
}
