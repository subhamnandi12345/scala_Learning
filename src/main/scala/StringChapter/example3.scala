package StringChapter

object example3 {
  def main(args: Array[String]): Unit = {
     val s="HELLO".map(c => (c.toByte+32).toChar)
    println(s)

    val s1="HELLO".map { c =>
      (c.toByte + 32).toChar

    }
   println(s1)
  }
}
