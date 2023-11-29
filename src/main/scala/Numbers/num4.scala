package Numbers

object num4 {
  def main(args: Array[String]): Unit = {
     val r = scala.util.Random
     var range = 5 to r.nextInt(150)
     println(range)

    println (for (i <- 0 to r.nextInt(10)) yield i * 2)
  }
}
