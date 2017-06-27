/**
 * Created by cjiang059 on 6/27/2017.
 */
object scalabasic {
  def addA(x:Int)=x+100
  val add=(x:Int)=>x+100

  def main(args: Array[String]) {
//    doWhile
    println(addA(2))
    println(add(2))
    study
  }

  def doWhile(): Unit ={
    var line=""
    do{
        line=readLine()
        println("pp===:"+line)
    }while(line!="")
  }

  def study(): Unit ={
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
