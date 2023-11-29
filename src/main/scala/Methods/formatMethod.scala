package Methods

object GFG {
  def main(args: Array[String]) {

    val x = "There are %d books and" +
      "cost of each book is %f"
    val y = 15
    val z = 345.25
    val r = x.format(y, z)
    println(r)
  }
}


