package StringChapter

import scala.collection.immutable.BitSet.empty.foreach

// Extracting Parts of a String That Match Patterns
object example6 {
  def main(args: Array[String]): Unit = {
    val pattern ="([0-9]+) ([A-Za-z])".r
    val pattern2 ="([0-9]+) (.+)".r
    val pattern2(count,fruit)="100 Banana"
    // println(pattern)
    println(count)
    println(fruit)
//    val (v1,v2,v3)=("software",23,34)
//    println(v1)
//    println(v2)
  }
}
