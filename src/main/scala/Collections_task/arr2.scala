package Collections_task
//Test the equality of two arrays
object test extends App{
  val array1 = Array(1, 2, 3)
  val array2 = Array(1, 2, 3)

  val haveSameElements = array1.sameElements(array2)
  println(s"Arrays have the same elements: $haveSameElements")
}