package Collections_task
//Separate even and odd numbers of a given array of integers

object arr3 extends App{
  val arr=Array(2,7,8,4,5,10,13,16)
  val (evens, odds) = arr.partition(_ % 2 == 0)
  println(evens.mkString(","))
  println(odds.mkString(","))
}

