package Control_Structures

object con2 {
  def main(args: Array[String]): Unit = {
    val a = Array("apple", "banana", "orange")
    for (i <- 0 until a.length) {
      println(s"$i is ${a(i)}")
    }
  }
}
