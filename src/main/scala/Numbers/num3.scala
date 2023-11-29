package Numbers

import scala.util.Random

object num3 {
  def main(args: Array[String]): Unit = {
    val r = scala.util.Random
    println(r.nextInt)
    println(r.nextInt(100))
    //creating using object
    val p=new Random(100)
    println(p.nextInt)
  }
}
