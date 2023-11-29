package Objects_Chapter

object ob2{
  def main(args: Array[String]): Unit = {
    printAll(123 ,23,3,2,3,34)
    printClass("sub")
  }
   def printClass(c: Any) { println(c.getClass) }

   def printAll(numbers: Int*) {
     numbers.foreach(println)
  }
}

