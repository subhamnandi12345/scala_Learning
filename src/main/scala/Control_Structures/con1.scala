package Control_Structures

object con1 {
  def main(args: Array[String]): Unit = {
    val nieces = List("emily", "hannah", "mercedes", "porsche")
    for (n <- nieces) {
      print(n+" ")
    }
    for (w <- 0 to 10) {
      println(w)
    }
//    for (w <- 0 to 5; x <- 0 to 5) {
//      println("The value are " + w, x)
//    }

  }
}
