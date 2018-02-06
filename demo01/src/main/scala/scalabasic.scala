import scala.collection.mutable.ArrayBuffer

/**
 * Created by cjiang059 on 6/27/2017.
 */
class student{
  var age = 0
  //默认为private
  var name: String = _//必须赋值，不然就是抽象字段
  private var s = 0
  private[this] var y = 0

  def this(name: String) {
    //构造器
    this() //必须
    this.name = name
  }

  def comm(oo: student) = {
    this.s > oo.s; //报错this.y>oo.y}
  }
}
class student2(var name:String,var  age:Int){
  def pp={println(this.name)}

}
object scalabasic {
  //var temp1= new student  student 加了private后不能调用默认构造方法
  var t1=new student("dd")
  println(t1.name)


  def addA(x:Int)=x+100
  val add=(x:Int)=>x+100

  def main(args: Array[String]) {
    val ss1=new student
    println(ss1.age)

    var b=ArrayBuffer[Int]()
    b+=1
    b+=(2,3,4)
    b++=Array(5,6,7)
    b.trimEnd(2)
    b.insert(1,8,9)
    b.remove(5)//b.remove(3,1) 位置,个数
    var a=b.toArray
    var result=for(o<-a) yield o*2
    for(o<-a) print(o+" ")
    println()
    var c=result.filter(_%2==0).map(2*_)
    for(o<-result) print(o+" ")
    println()
    for(o<-c) print(o+" ")
    println()
    println(a.sum)
    println(a.max)
    a=a.sorted
//    scala.util.Sorting.quickSort(a)
    for(o<-a) print(o+" ")
    println()
    var s1=a.mkString(",")
    println(s1)
    var s2=a.mkString("<",",",">")
    println(s2)
    //多维数组
    var mat=Array.ofDim[Int](2,2)
    println()
    mat(1)(1)=100
    for(o<-mat){
      for(i<-o)
        print(i+" ")
    println()
    }
    val map=Map("book"->20,"gi"->10,"gun"->33)
    for((k,v)<-map)yield (k,v*2)

//    println(result)

    //    doWhile
//    println(addA(2))
//    println(add(2))
//    study(1,2,3,4,5)
  }

  def doWhile(): Unit ={
    var line=""
    do{
//        line=readLine()
        println("pp===:"+line)
    }while(line!="")
  }

  def study(args:Int*): Unit ={
    var result=0;
    for(arg<-args){
      result+=arg
    }
    println("pp="+result)
    for(i<- 1 to 5){
      try{
        var n=if(i%2 == 0)i/2 else throw new RuntimeException("n must be event")
      }catch {
        case e:Exception => println(e.getMessage())
      }
    }
    val files=(new java.io.File(".")).listFiles()
    for(file<- files){
      println(file)
    }
    val triple=(100,"scala","spark")
    println(triple._1)
    println(triple._2)
    val array=Array(1,2,3,4,5,6)
    for(i<-0 until array.length){
      println(array(i))
    }
    val age=Map("rock"->27,"sprak"->5)
    for((k,v)<-age){
      println(k+":"+v)
    }

    for(i<-1 to 2;j<-1 to 2 if i!=j) println(i+j)

  }


}
