package StringChapter

object example5 {
  def main(args: Array[String]): Unit = {
    val address = "Helloeorld123".replaceAll("[A-Za-z]+", "")
    println(address)
    // another approach
//    val reg="software".r
//    val result =reg.replaceAllIn("great software ","Laboratory")
//    println(result)
  }
}
