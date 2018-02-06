/**
 * Created by cjiang059 on 7/24/2017.
 */
object regRgress {

  def main (args: Array[String]) {
    val regex="""[0-9]+""".r
    for(matchstrig<-regex.findAllIn("99345 Scala,22298 Spark")) println(matchstrig) //findFirstIn
//    val regex2(num,item)="99 hadoop"
//    val line="99345 hadoo"
//    line match{
//      case regex(num,blog)=>println(num+"\t"+blog)
//      case _=>println("oopes...")
//    }
  }

}
