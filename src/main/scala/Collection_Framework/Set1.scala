package Collection_Framework

object col2 extends App{
  //immutable set
  val emptySet: Set[Int] = Set() // Empty set
  val numbersSet: Set[Int] = Set(1, 2, 3, 4,4) // Set of integers
  //Immutable set
  //val mutableSet = collection.mutable.Set(1, 2, 3)
  println("set is :"+ numbersSet)
  println("Head of set : " + numbersSet.head)
  println("Tail of set : " + numbersSet.tail)
  println("Check if set is empty : " +numbersSet.isEmpty)
  println("Check if set is empty : " + emptySet.isEmpty)
  println("Min element in Set : " + numbersSet.min)
  println("Max element in Set : " + numbersSet.max)
   val numberSet2=Set(2,4,6,7,10)
  println("common ellemnts  : " + numbersSet.&(numberSet2))
  println("common elements : " + numbersSet.intersect(numberSet2))
}