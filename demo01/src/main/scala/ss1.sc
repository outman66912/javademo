
object ss1 {
  val map=Map("book"->20,"gi"->10,"gun"->33)//immutable 不可变的map
  for((k,v)<-map)yield (k,v*2)
  var temp=map.getOrElse("book",0)
  var temp1=map.getOrElse("bokk",0)
  var temp3=map.get("book")
  var temp4=map.get("nook")
  val score=scala.collection.mutable.Map("book"->10)//可变map
  score+=("R"->9)
  score-="book"
  val score1=scala.collection.immutable.SortedMap("book"->10,"al"->20)
  var tuple=(1,2,3.1,"sss")
  var temp5=tuple._1
  val (a,b,c,_)=tuple
  val s1=Array("[","-","]")
  val s2=Array(2,5,2)
  val s3=s1.zip(s2)
  for((x,y)<-s3) Console.print(x*y)// print(x*y)

}