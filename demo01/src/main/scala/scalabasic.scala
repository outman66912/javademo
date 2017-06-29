import scala.collection.mutable.ArrayBuffer

/**
 * Created by cjiang059 on 6/27/2017.
 */
object scalabasic {
  def addA(x:Int)=x+100
  val add=(x:Int)=>x+100

  def main(args: Array[String]) {

    var b=ArrayBuffer[Int]()
    b+=1
    b+=(2,3,4)
    b++=Array(5,6,7)
    b.trimEnd(2)
    b.insert(1,8,9)
    b.remove(5)//b.remove(3,1) 位置,个数
    val a=b.toArray
    for(o<-a){
      println(o)
    }

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
