import java.io.{File, PrintWriter}

import scala.io.Source


/**
 * Created by cjiang059 on 7/11/2017.
 */
class file {
  println("11111222222")

}

object fileops{
  def main(args: Array[String]) {
    new file
    var readline=Console.readLine()
    val file=Source.fromFile("C:\\SUService.log")
    for(line<-file.getLines()){
      println(line)
    }
    file.close()

    val webfile=Source.fromURL("http://spark.apache.org/")
    webfile.foreach(print(_))
    webfile.close()

    val write =new PrintWriter(new File("scala.txt"))//写文件
    for(i<-1 to 100) write.println(i)
    write.close()


  }

}
