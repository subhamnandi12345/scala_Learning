package Control_Structures
object con3 {
  def main(args: Array[String]): Unit = {
  var a=  for (i <- 1 to 10){
      if(i<4){
        println(i)
      }

    }
    println(a)
    val names = Map("fname" -> "Robert",
      "lname" -> "Goren")
    for ((k, v) <- names) println(s"key: $k, value: $v")
  }
}
