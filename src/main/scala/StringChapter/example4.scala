package StringChapter

import scala.util.matching.Regex

object example4 {
  def main(args: Array[String]): Unit = {
    val numPattern = "[0-9]+".r
    //val a="[0-9]+" [a-zA-Z][0-9]".r
    val b="([A-Za-z]) ([A-Da-d]+)".r
   // res1="B"
    //res2="abc"
   // res3="abj"
     val b(res1,res2)="A acj"
    println(res1)
    println(res2)
//    val address = "123 main street suite 101"
//        val match1=numPattern.findFirstIn(address)
//       println(match1)
//        val matches =numPattern.findAllIn(address)  // for searcing whole string
//          println(matches)
//       // matches.foreach(println)
//
//    val num=new Regex("[0-9]+")
//    val addreess1="123 main street suite 101"
//    val match2=num.findAllIn(addreess1)
//    match2.foreach(println)
  }
}
