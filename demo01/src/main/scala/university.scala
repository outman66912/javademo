import org.codehaus.plexus.logging.console.ConsoleLogger

/**
 * Created by cjiang059 on 7/10/2017.
 */
import java.util._ //相当于*
import java.util.{HashMap=>javahashmap} //防止同名 引用别名
import scala.{StringBuilder=>_} //隐藏掉
class university {
  println("初始化1111")
  def apply()={
    println("111111111111")
  }
//  println(university.news);直接调用伴生类的属性和方法
  def havetry={
    println("22222222222")
  }
  override def toString="I am a string"
}
class  un2 extends university(){//继承主构造器
  println("初始化222")
}
object university{
  def apply()={
    println("00000000")
    new university
  }
  private var i=0
  private def news={
    i+=1
  }
}

trait jj1{//接口
  def log={println("000000")}
}
trait jj12 extends jj1{
  override def log={println("11111111")}
}
abstract class jj{
  var id:Int
  def method1
}
class jj2 extends jj with jj1{//继承抽象类   继承一个抽象类或者接口用extends 2个用with
  override var id=1
  override def  method1={
    println("1123")
    log
  }
  override def log={println("333333")}
}
object gg{
  def main(args: Array[String]) {
//    var b=new un2()
    var a= university() //不用new 会使用傍生类  并使用apply方法
    a.havetry
    var b=new university()
    println(b())
//    println(a.toString)
//
//    var kk=new jj2 with jj12 //对象混入  对象继承同一接口
//    kk.method1
  }
}